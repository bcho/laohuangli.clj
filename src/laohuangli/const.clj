(ns laohuangli.const)

(defrecord Activity [name reason-good reason-bad weekend?])

(def activites
  (list 
    (Activity. "写单元测试" "写单元测试将减少出错" "写单元测试会降低你的开发效率" false)
    (Activity. "洗澡" "你几天没洗澡了？" "会把设计方面的灵感洗掉" true)
    (Activity. "锻炼一下身体" "" "能量没消耗多少，吃得却更多" true)
    (Activity. "抽烟" "抽烟有利于提神，增加思维敏捷" "除非你活够了，死得早点没关系" true)
    (Activity. "白天上线" "今天白天上线是安全得" "可能导致灾难性后果" false)
    (Activity. "重构" "代码质量得到提高" "你很有可能会陷入泥潭" false)
    (Activity. "使用%t" "你看起来更有品味" "别人会觉得你在装逼" false)
    (Activity. "跳槽" "该放手时就放手" "鉴于当前的经济形式，你的下一份工作未必比现在强" false)
    (Activity. "招人" "你面前这位有成为牛人的潜质" "这人会写程序吗？" false)
    (Activity. "面试" "面试官今天心情很好" "面试官不爽，会拿你出气" false)
    (Activity. "提交辞职申请" "公司找到了一个比你更能干更便宜的家伙，巴不得你赶快滚蛋" "鉴于当前的经济形势，你的下一份工作未必比现在强" false)
    (Activity. "申请加薪" "老板今天心情很好" "公司正在考虑裁员" false)
    (Activity. "晚上加班" "晚上是程序员精神最好的时候" "" true)
    (Activity. "在妹子面前吹牛" "改善你矮穷挫的形象" "会被识破" true)
    (Activity. "撸管" "避免缓冲区溢出" "强撸灰飞烟灭" true)
    (Activity. "浏览成人网站" "重拾对生活的信心" "你会心神不宁" true)
    (Activity. "命名变量%v" "" "" false)
    (Activity. "写超过%l行的方法" "你的代码组织的很好，长一点没关系" "你的代码将混乱不堪，你自己都看不懂" false)
    (Activity. "提交代码" "遇到冲突的几率是最低的" "你遇到的一大堆冲突让你觉得自己是不是时间穿越了" false)
    (Activity. "代码复审" "发现重要问题的几率大大增加" "你什么问题都发现不了，白白浪费时间" false)
    (Activity. "开会" "写代码之余放松一下打个盹，有益健康" "小心被扣屎盆子背黑锅" false)
    (Activity. "打DOTA" "你将如有神助" "你会被虐得很惨" true)
    (Activity. "晚上上线" "晚上是程序员精神最好的时候" "你白天已经筋疲力尽了" false)
    (Activity. "修复BUG" "你今天对BUG的嗅觉大大提高" "新产生的BUG将比修复的更多" false)
    (Activity. "设计评审" "设计评审会议将变成头脑风暴" "人人筋疲力尽，评审就这么过了" false)
    (Activity. "需求评审" "" "" false)
    (Activity. "上微博" "今天发生的事不能错过" "今天的微博充满负能量" true)
    (Activity. "上AB站" "还需要理由吗？" "满屏兄贵亮瞎你的眼" true)
    (Activity. "玩FlappyBird" "今天破纪录的几率很高" "除非你想玩到把手机砸了" true)))

(def variable-names
  (list "jieguo" "huodong" "pay" "expire" "zhangdan" "every" "free"
        "i1" "a" "virtual" "ad" "spider" "mima" "pass" "ui"))

(def toolings
  (list "Eclipse写程序" "MSOffice写文档" "记事本写程序"
        "Windows8" "Linux" "MacOS" "IE" "Android设备" "iOS设备"))

(def drinkings
  (list "水" "茶" "红茶" "绿茶" "咖啡" "奶茶" "可乐" "鲜奶" "豆奶" "果汁"
        "果味汽水" "苏打水" "运动饮料" "酸奶" "酒"))

(def directions (list :北方 :东方 :南方 :西方 :东北方 :东南方 :西南方 :西北方))

(def weekdays (list :星期日 :星期一 :星期二 :星期三 :星期四 :星期五 :星期六))

(defn weekend? [day]
  (let [day-sym (keyword day)]
    (or (= day-sym :星期六)
        (= day-sym :星期日))))
(defn weekday? [day] (not (weekend? day)))
