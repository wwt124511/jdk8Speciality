JDK8新特性
====
## 1. Lambda表达式
<Tab>Lambda表达式的基础语法：Java8中引入了一个新的操作符 "->" 该操作符成为箭头操作符或Lambda操作符</Tab><br>
<Tab>左侧：Lambda表达式的参数列表</Tab><br>
<Tab>右侧：Lambda表达式中所需要执行的功能，即Lambda体</Tab><br><br>

### 1.1 Lambda表达式基础语法<br><br>
#### Lambda 表达式需要“函数式接口”的支持<br>
**函数式接口：接口中只有一个抽象方法，成为函数式接口**<br><br>

#### 语法格式一：无参数，无返回值<br>
<Tab>() -> System.out.println("hello Lambda")</Tab><br><br>

#### 语法格式二：有一个参数，并且无返回值<br>
<Tab>(x) -> System.out.println("hello Lambda")</Tab><br><br>

#### 语法格式三：有一个参数，并且无返回值，参数的小括号可以不写<br>
<Tab>x -> System.out.println("hello Lambda")</Tab><br><br>

#### 语法格式四：有两个以上的参数，并且Lambda体中多条语句，并且有返回值<br>
```
(x,y) -> {
  int a = 23;
  return a;
 }
```
<br>

#### 语法格式五：若Lambda体中只有一条语句，那么return和{}都可以不写<br>
<Tab>(x,y) -> System.out.println("hello Lambda")</Tab><br><br>

#### 语法格式六：<br>
**Lambda表达式的参数列表的数据类型可以省略不写，因为JVM编译器可以通过**<br>
**上下文推断出数据类型，即【类型推断】**<br><br>


### 1.2 四大内置核心函数式接口<br><br>

### 1.3 方法引用与构造器引用<br><br>



## 2. Stream API
### 2.1 获取Stream的几种方式<br><br>
### 2.2 筛选与切片<br><br>
### 2.3 映射<br><br>
### 2.4 排序<br><br>
### 2.5 查找与匹配<br><br>
### 2.6 归纳与收集<br><br>
### 2.7 并行流与串行流<br><br>


## 3. LocalDate日期
