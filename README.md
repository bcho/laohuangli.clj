# laohuangli.clj

程序员老黄历.clj

## Demo

```clojure
user=> (pprint (laohuangli.generator/huangli))
{:date {:year 2015, :month 11, :day 10, :dayOfWeek :星期二},
 :good
 ({:name "白天上线", :reason "今天白天上线是安全得"}
  {:name "重构", :reason "代码质量得到提高"}
  {:name "跳槽", :reason "该放手时就放手"}
  {:name "面试", :reason "面试官今天心情很好"}),
 :bad
 ({:name "申请加薪", :reason "公司正在考虑裁员"}
  {:name "设计评审", :reason "人人筋疲力尽，评审就这么过了"}),
 :drinkings ["绿茶" "咖啡"],
 :directions :东北方,
 :goddess (\★ \★ \★ \★ \★)}
```

## License

Copyright © 2015 hbc

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
