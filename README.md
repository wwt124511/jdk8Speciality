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
**Consumer<T>：消费型接口**
```
void accept(T t);
```
**Supplier<T>：供给型接口**
```
T get();
```
**Function<T, R>：函数型接口**
```
R apply(T t);
```
**Predicate<T>：断言型接口**
```
boolean test(T t);
```
<br><br>

### 1.3 方法引用与构造器引用<br><br>
**Lambda表达式中的方法引用方式**
* 对象::实例方法名
* 类::静态方法名
* 类::实例方法名

**构造器引用**<br>
* 语法：ClassName::new
<br><br>
## 2. Stream API
### 2.1 Stream的三个操作步骤<br><br>
* 创建Stream
* 中间操作
* 终止操作（终端操作）
<br>
### 2.2 筛选与切片<br><br>
* filter： 接收Lambda，从流中排除某些元素
* limit： 截断流，使其元素不超过给定数量
* skip(n)： 跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit(n)互补
* distinct： 筛选，通过流所生成元素的hashCode()和equals()去除重复元素
<br>
### 2.3 映射<br><br>
* map： 
<br>
### 2.4 排序<br><br>
* sort： 
<br>
### 2.5 查找与匹配<br><br>
### 2.6 归纳与收集<br><br>
### 2.7 并行流与串行流<br><br>


## 3. LocalDate日期
