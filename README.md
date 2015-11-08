# laohuangli.clj

程序员老黄历.clj

## Demo

```clojure
user=> (pprint (laohuangli.generator/huangli))
{:date {:year 2015, :month 11, :day 8, :dayOfWeek :星期日},
 :good
 ({:name "使用iOS设备", :reason "你看起来更有品味"}
  {:name "申请加薪", :reason "老板今天心情很好"}
  {:name "代��复审", :reason "发现重要问题的几率大大增加"}
  {:name "设计评审", :reason "设计评审会议将变成头脑风暴"}),
 :bad
 ({:name "使用iOS设备", :reason "别人会觉得你在装逼"}
  {:name "申请加薪", :reason "公司正在考虑裁员"}
  {:name "代码复审", :reason "你什么问题都发现不了，白白浪费时间"}
  {:name "设计评审", :reason "人人筋疲力尽，评审就这么过了"}),
 :drinkings ["水" "可乐"],
 :directions :北方,
 :goddess (\★ \★ \☆ \☆ \☆)}
```

## License

Copyright © 2015 hbc

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
