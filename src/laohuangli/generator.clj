(ns laohuangli.generator
  (:require [laohuangli.const :as const]
            [clojure.string :as cstr])
  (:import (java.util Calendar)))


(defn vec-remove [v pos]
  (vec (concat (subvec v 0 pos) (subvec v (inc pos)))))


(defn today []
  (let [d (-> (Calendar/getInstance) .getTime bean)]
    {:year (-> d :year (+ 1900))
     :month (-> d :month (+ 1))
     :day (-> d :date)
     :dayOfWeek (nth const/weekdays (:day d))}))


(defn today-seed []
  (let [t (today)
        year (:year t)
        month (:month t)
        day (:day t)]
    (+ (* year 1000) (* month 100) day)))


(defn random [seed]
  (let [seed (+ 100 seed)]
    (loop [i 0
           n (mod (today-seed) 11117)]
      (if-not (< i seed)
        n
        (recur (inc i)
               (mod (* n n) 11117))))))


(defn today-available-activites []
  (let [d (:dayOfWeek (today))]
    (if (const/weekend? d)
      const/activites
      (filter #(-> % (:weekend?) not) const/activites))))


(defn pick-items [items cnt]
  (let [total-cnt (count items)
        remove-cnt (- total-cnt cnt)
        remove-index #(-> (mod (random %1) %2))]
    (loop [removed-cnt 0
           picked (vec items)]
      (if (= removed-cnt remove-cnt)
        picked
        (recur (inc removed-cnt)
               (vec-remove picked (remove-index removed-cnt (count picked))))))))


(defn pick-tool []
  (let [i (mod (random 12) (count const/toolings))]
    (nth const/toolings i)))


(defn pick-variable-name []
  (let [i (mod (random 11) (count const/variable-names))]
    (nth const/variable-names i)))


(defn pick-line-count []
  (let [i (+ (mod (random 12) 247) 30)]
    (str i)))


(defn present-activite-name [n]
  (-> n
      (cstr/replace "%t" (pick-tool))
      (cstr/replace "%v" (pick-variable-name))
      (cstr/replace "%l" (pick-line-count))))


(defn present-activite [reason-field activite]
  {:name (present-activite-name (:name activite))
   :reason (reason-field activite)})
(def present-good-active (partial present-activite :reason-good))
(def present-bad-active (partial present-activite :reason-bad))


(defn huangli-activites []
  (let [activites (today-available-activites)
        count-good (-> (random 98) (mod 3) (+ 2))
        count-bad (-> (random 87) (mod 3) (+ 2))
        picked-activites (pick-items activites (+ count-good count-bad))]
      {:good (map present-good-active
                  (subvec picked-activites 0 count-good))
       :bad (map present-bad-active
                 (subvec picked-activites (inc count-good)))}))


(defn huangli-drinkings [] {:drinkings (pick-items const/drinkings 2)})


(defn hunagli-directions []
  (let [i (mod (random 2) (count const/directions))]
    {:directions (nth const/directions i)}))


(defn huangli-goddess []
  (let [i (inc (mod (random 6) 5))]
    {:goddess (drop (- 5 i) (take (- 10 i) "★★★★★☆☆☆☆☆"))}))


(defn huangli-date []
  {:date (today)})


(defn huangli []
  (merge (huangli-date)
         (huangli-activites)
         (huangli-drinkings)
         (hunagli-directions)
         (huangli-goddess)))
