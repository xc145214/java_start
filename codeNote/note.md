# java 25 day

## day01


## day02




## day03
学习结果：
1,逻辑运算符什么时候用？

2，&和&&有什么区别？

3，如何理解位运算符中 & 和 |，^,你认为什么时候会用到？

4，>>  <<移位运算符的特点是什么？什么时候用？

5，三元运算符和if else语句的区别？使用场景？

6，if和switch和循环结构的应用场景。

7，switch语句都有哪些特点？

8，for和while的区别。

9，局部代码块有什么用？什么时候用？

if和switch的应用：

if:
	1,对具体的值进行判断。
	2,对区间判断。
	3,对运算结果是boolean类型的表达式进行判断。

switch:
	1,对具体的值进行判断。
	2,值的个数通常是固定的。
	对于几个固定的值判断，建议使用switch语句，因为switch语句会将具体的答案都加载进内存。
	效率相对高一点。
## day04

学习结果:

1，大圈套小圈思想，什么时候使用？

2，break，continue作用的范围和作用。

3，如何理解函数？(特点，注意事项)

4，怎么定义一个函数？

5，函数重载什么时候使用？

6，数组是什么？

7，数组有什么特点？

8，数组什么时候使用？

9，java的内存(栈和堆)的特点？

10，画出一个数组的内存分布图。并用文字描述步骤。


1,函数
	1，定义
	2，特点。
		void?
	3，注意：
	4，使用。



方法：记笔记。目的：明确学习大纲。遇到的问题。

心态：
	1，急躁。
	2，信心缺失。
	解决方法。

重在交流。



学习技术的方法：
回家复习：
1，总结。：用四个明确的方式。
	技术点：函数。

	1，这个技术是什么？
	2，这个技术有什么特点？
	3，这个技术怎么用？
	4，这个技术什么时候用？
	注意：如果没有特多时间，对于零基础的学员，那么你可以注重第三明确和第四明确。
		如果你的时间少的可怜，那么必须注重第三个明确。
		必须要保证这个技术基本会用。
	5，这个技术怎么讲？(如果你想进行岗位提升，转换内训师，讲师)

2，敲代码。
	其实代码就是仅仅是思想的体现而已。 没思想没代码。

3，预习。





预习内容。
有基础的同学怎么办？



视频笔记.


第一题
int x = 1,y=1;

if(x++==2 & ++y==2)
{
	x =7;

}
System.out.println("x="+x+",y="+y);//x=2,y=2


---------------------------------------------------
第二题
int x = 1,y = 1;

if(x++==2 && ++y==2)
{
	x =7;
}
System.out.println("x="+x+",y="+y);//x=2,y=1

---------------------------------------------------

第三题
int x = 1,y = 1;

if(x++==1 | ++y==1)
{
	x =7;
}
System.out.println("x="+x+",y="+y);//x=7,y=2


---------------------------------------------------

第四题
int x = 1,y = 1;

if(x++==1 || ++y==1)
{
	x =7;
}
System.out.println("x="+x+",y="+y);//x=7,y=1


---------------------------------------------------
第五题
boolean b = true;

if(b==false)  //如果写成if(b=false)有结果吗？如果有，结果是？
	System.out.println("a");
else if(b)
	System.out.println("b");
else if(!b)
	System.out.println("c");
else
	System.out.println("d");


---------------------------------------------------

第六题
int x = 2,y=3;

switch(x)
{
	default:
		y++;
	case 3:
		y++;
	case 4:
		y++;
}

System.out.println("y="+y);
## day05

## day06
举例：
大象装进冰箱。

面向过程。

打开冰箱。
存储大象。
关上冰箱。

对于面向过程思想，强调的是过程(动作).

C语言.



面向对象。

对于面向对象思想，强调的是对象(实体)。
冰箱打开。
冰箱存储。
冰箱关闭。

C++  Java  C#


特点：
1，面向对象就是一种常见的思想。符合人们的思考习惯。
2，面向对象的出现，将复杂的问题简单化。
3，面向对象的出现，让曾经在过程中的执行者，变成了对象中的指挥者。

## day06
## day07
## day08

函数：


数组：


---------------------

面向对象：

1，面向对象和面向过程思想。

	面向对象强调的是对象实例。
	面向过程强调的是动作。
	对象将动作进行封装。

	在问题领域中，我们先去找的都是涉及的对象，
	然后分析对象的属性和行为。


2，面向对象的特点。
	1，是一种常见思想。
	2，复杂变简单。
	3，执行者变指挥者。
	举例：面试的例子。


3，类与对象的关系。
	类：就是对事物的描述，其实类就是将对象共性的内容进行抽取。
	对象：就是该类事物实实在在存在个体，在java中通过new来完成创建的，
		堆内存的对象主要用于封装对象中的特有数据。


4，类中的成员：
	成员变量：事物的属性，
	成员函数：事物的行为。

	成员变量和局部变量的区别？
	答：

	如何使用成员，只要建立该类对象，并通过 "对象.对象成员" 就可以完成调用

5，封装。
	隐藏实现细节，并对外提供公共的访问方式。

	函数或者类都是一个封装体。

	特点：
	1，隔离的变量。
	2，便于使用。
	3，提高复用。
	4，提高安全性。

	举例：机箱的例子


	体现之一：私有。

	私有在源代码中的使用就是在本类中有效。

	通常会将成员变量xxx私有化，并对外提供对应的setXxx getXxx方法对其进行访问。
	其实目的就是成员变量访问进行控制。 让成员的访问具备可控性，提高了程序的健壮性。

	私有仅仅是封装的体现形式之一而已。

	自定义一个Person类。动手。

6，构造函数。
	写法特点：
	1，函数名和类名相同。
	2，不需要定义返回值类型
	3，没有具体的返回值。但是有return语句，用于结束构造函数。

	使用特点：
	1，定义类中，有默认的空参数构造函数。如果已经自定义，那么默认就没有了。
	2，构造函数在类有多个，是重载形式体现出来的。

	构造函数的作用：
	用于给对象进行针对性的初始化。



	构造函数和一般函数的区别？
	1，
	2，
	3，

	什么时候使用构造函数呢？
	当对象创建时就需要一些内容(数据和行为)，那么这些内容都定义在构造函数中。

7，this关键字.
	this：代表的是对象。哪个对象调用了this所在的函数，this就代表哪个对象。

	用法体现
	1，当成员变量和局部变量同名时，可以用this区别。
	2，当构造函数中调用本类其他构造函数时，可以用this完成。 this(实际参数);
		这种调用必须定义在构造函数的第一行。初始化动作先完成。

	应用：只要在定义功能时，用到了本类对象，那么就使用this来表示。


8，static关键字：

	特点：
	1，修饰成员。，
	2，随着类加载，随着类消失。
	3，优先于对象。
	4，用类名直接访问

	使用注意事项:
	1，静态方法只能访问静态，静态有访问局限性。
	2，静态方法中不能有this super关键字。
	3，主函数是静态的。

	静态变量和成员变量的区别？
	1，
	2，
	3，
	4，


	什么时候使用静态？
	1，当成员变量的数据各个对象都相同时，可以用static修饰，让多个对象共享。
	2，函数如果访问了特有数据(非静态成员变量),该函数是非静态的。
	   函数如果没有访问特有数据，那么该函数就可以静态修饰。



	如果类中的功能都是静态的，那么该类创建对象是没有意义的，所以构造函数需要私有化。



9，代码块。
	1，局部代码快。
		对局部变量的生命周期进行控制。
	2，构造代码块。
		对所有对象进行初始化。
	3，静态代码块。
		对类进行初始化。


10，单例设计模式：
	1，解决的问题：保证类在内存的对象唯一性。
	2，思路：
	3，步骤：
	4，两种方式的区别？懒汉式(延迟加载方式)，饿汉式



设计的内存图要会画！必须的。

## day09



抽象类和接口的异同点：

相同点：
	都是不断向上抽取而来的。


不同点：
	1，抽象类需要被继承，而且只能单继承。
	   接口需要被实现，而且可以多实现。
	2，抽象类中可以定义抽象方法和非抽象方法，子类继承后，可以直接使用非抽象方法。
	   接口中只能定义抽象方法，必须由子类去实现。
	3，抽象类的继承，是is a关系，在定义该体系的基本共性内容。
	   接口的实现是 like a 关系，在定义体系额外功能。




犬按功能分：有导盲犬，搜爆犬。


abstract class 犬
{
	abstract void 吼叫();
}

//abstract class 导盲
interface 导盲
{
	abstract void 导盲();
}


class 导盲犬 extends 犬 implements 导盲
{
	public void 吼叫()
	{
	}
	public void 导盲(){}
}



//在不同的问题领域中，有不同的分析方式。
学员：
	学习。
	抽烟学员




烟民。

## day10

## day11

## day12
## day13
## day14

wait 和 sleep 区别？

1，wait可以指定时间也可以不指定。
   sleep必须指定时间。

2，在同步中时，对cpu的执行权和锁的处理不同。
	wait：释放执行权，释放锁。
	sleep:释放执行权，不释放锁。


/*
多线程总结：

1，进程和线程的概念。
	|--进程：
	|--线程：

2，jvm中的多线程体现。
	|--主线程，垃圾回收线程，自定义线程。以及他们运行的代码的位置。

3，什么时候使用多线程，多线程的好处是什么？创建线程的目的？
	|--当需要多部分代码同时执行的时候，可以使用。

4，创建线程的两种方式。★★★★★
	|--继承Thread
		|--步骤
	|--实现Runnable
		|--步骤
	|--两种方式的区别？

5，线程的5种状态。
	对于执行资格和执行权在状态中的具体特点。
	|--被创建：
	|--运行：
	|--冻结：
	|--临时阻塞：
	|--消亡：

6，线程的安全问题。★★★★★
	|--安全问题的原因：
	|--解决的思想：
	|--解决的体现：synchronized
	|--同步的前提：但是加上同步还出现安全问题，就需要用前提来思考。
	|--同步的两种表现方法和区别：
	|--同步的好处和弊端：
	|--单例的懒汉式。
	|--死锁。


7，线程间的通信。等待/唤醒机制。
	|--概念：多个线程，不同任务，处理同一资源。
	|--等待唤醒机制。使用了锁上的 wait notify notifyAll.  ★★★★★
	|--生产者/消费者的问题。并多生产和多消费的问题。  while判断标记。用notifyAll唤醒对方。 ★★★★★
	|--JDK1.5以后出现了更好的方案，★★★
		Lock接口替代了synchronized
		Condition接口替代了Object中的监视方法，并将监视器方法封装成了Condition
		和以前不同的是，以前一个锁上只能有一组监视器方法。现在，一个Lock锁上可以多组监视器方法对象。
		可以实现一组负责生产者，一组负责消费者。
	|--wait和sleep的区别。★★★★★



8，停止线程的方式。
	|--原理：
	|--表现：--中断。

9，线程常见的一些方法。
	|--setDaemon()
	|--join();
	|--优先级
	|--yield();
	|--在开发时，可以使用匿名内部类来完成局部的路径开辟。


## day15


## day16

1，学习方法，不要因为一点小问题而导致大技术的学习。
	学习方法不在于听，而在做，并坚持。
	作业可以最后一题开始做。节省时间必须要敲代码。


2，集合对象的由来和特点。

3，集合和数组的异同点？

4，集合体系由来？

5，必须了解一下顶层集合中的共性方法？

6，迭代器是一个什么玩意？

interface Iterator
{
	public abstract boolean hasNext();
	public abstract Object next();
}
interface Collection
{
	boolean add();
	Iterator getIns();
}

class MyRongqi implements Collection
{
	add()
	{}

	private class hehe implements Iterator
	{
		public boolean hasNext(){}
		public Object next(){}
	}
	public Iterator getIns()
	{
		return new hehe();
	}

}

 MyRongqi.hehe a = new MyRongqi().getIns();
Iterator it = new MyRongqi().getIns();

class MyRongqi2  implements Collection
{
	add(){}
	private class hehe implements Iterator
	{
		public boolean hasNext(){}
		public Object next(){}
	}
	public Iterator getIns()
	{
		return new hehe();
	}

}
method(new MyRongqi());
public void method(Collection coll)
{
	Iterator it = coll.getIns():
}

 MyRongqi2.hehe a = new MyRongqi2().getIns();

 Iterator it = new MyRongqi2().getIns();

7，集合中常见的两个子体系及特点？

8，List体系中的常见的特性方法？

9，List中的常见的子类对象，以及它们的特点？



练习：动手：

自定义Person对象。
将多个Person对象存储到集合中。
并取出。打印Person的姓名和年龄.


明天预习 ：linkedlist特有方法。  栈，队列。

Set集合。HashSet，TreeSet


集合类的由来：
	对象用于封装特有数据，对象多了需要存储，如果对象的个数不确定。
	就使用集合容器进行存储。

集合特点：
1，用于存储对象的容器。
2，集合的长度是可变的。
3，集合中不可以存储基本数据类型值。



集合容器因为内部的数据结构不同，有多种具体容器。
不断的向上抽取，就形成了集合框架。

框架的顶层Collection接口：

Collection的常见方法：

1，添加。
	boolean add(Object obj):
	boolean addAll(Collection coll):


2，删除。
	boolean remove(object obj):
	boolean removeAll(Collection coll);
	void clear();

3，判断：
	boolean contains(object obj):
	boolean containsAll(Colllection coll);
	boolean isEmpty():判断集合中是否有元素。

4，获取：
	int size():
	Iterator iterator():取出元素的方式：迭代器。
	该对象必须依赖于具体容器，因为每一个容器的数据结构都不同。
	所以该迭代器对象是在容器中进行内部实现的。
	对于使用容器者而言，具体的实现不重要，只要通过容器获取到该实现的迭代器的对象即可，
	也就是iterator方法。

	Iterator接口就是对所有的Collection容器进行元素取出的公共接口。
	其实就是抓娃娃游戏机中的夹子！


5，其他：
	boolean retainAll(Collection coll);取交集。
	Object[] toArray():将集合转成数组。


-------------------------------
Collection
	|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
	|--Set：元素不能重复,无序。


List:特有的常见方法：有一个共性特点就是都可以操作角标。

1，添加
	void add(index,element);
	void add(index,collection);


2，删除；
	Object remove(index):


3，修改：
	Object set(index,element);


4，获取：
	Object get(index);
	int indexOf(object);
	int lastIndexOf(object);
	List subList(from,to);


list集合是可以完成对元素的增删改查。


List:
	|--Vector:内部是数组数据结构，是同步的。增删，查询都很慢！
	|--ArrayList:内部是数组数据结构，是不同步的。替代了Vector。查询的速度快。
	|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。




作业：
1，自己去查文档演示Vector中的elements()方法。

2，LinkedList中的，addFirst addLast getFirst，getLast  removeFirst removeLast。

3，既然集合是存储对象的，请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
并取出。将姓名和年龄打印出来。


## day17


1，用linkedlist模拟堆栈和队列？

2，HashSet结构是什么？该结构有什么特点？

3，HashSet是如何保证元素唯一性的。

4，TreeSet结构及其特点？

5，TreeSet如何保证元素唯一性。

6，TreeSet两种排序方式，有什么区别？

7，查阅集合的技巧？

8，泛型的理解？

9，大家把集合所涉及到的代码-狂敲！


集合类的由来：
	对象用于封装特有数据，对象多了需要存储，如果对象的个数不确定。
	就使用集合容器进行存储。

集合特点：
1，用于存储对象的容器。
2，集合的长度是可变的。
3，集合中不可以存储基本数据类型值。



集合容器因为内部的数据结构不同，有多种具体容器。
不断的向上抽取，就形成了集合框架。

框架的顶层Collection接口：

Collection的常见方法：

1，添加。
	boolean add(Object obj):
	boolean addAll(Collection coll):


2，删除。
	boolean remove(object obj):
	boolean removeAll(Collection coll);
	void clear();

3，判断：
	boolean contains(object obj):
	boolean containsAll(Colllection coll);
	boolean isEmpty():判断集合中是否有元素。

4，获取：
	int size():
	Iterator iterator():取出元素的方式：迭代器。
	该对象必须依赖于具体容器，因为每一个容器的数据结构都不同。
	所以该迭代器对象是在容器中进行内部实现的。
	对于使用容器者而言，具体的实现不重要，只要通过容器获取到该实现的迭代器的对象即可，
	也就是iterator方法。

	Iterator接口就是对所有的Collection容器进行元素取出的公共接口。
	其实就是抓娃娃游戏机中的夹子！


5，其他：
	boolean retainAll(Collection coll);取交集。
	Object[] toArray():将集合转成数组。


-------------------------------
Collection
	|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
	|--Set：元素不能重复,无序。


List:特有的常见方法：有一个共性特点就是都可以操作角标。

1，添加
	void add(index,element);
	void add(index,collection);


2，删除；
	Object remove(index):


3，修改：
	Object set(index,element);


4，获取：
	Object get(index);
	int indexOf(object);
	int lastIndexOf(object);
	List subList(from,to);


list集合是可以完成对元素的增删改查。


List:
	|--Vector:内部是数组数据结构，是同步的。增删，查询都很慢！
	|--ArrayList:内部是数组数据结构，是不同步的。替代了Vector。查询的速度快。
	|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。



LinkedList:

	addFirst();
	addLast():
	jdk1.6
	offerFirst();
	offetLast();


	getFirst();.//获取但不移除，如果链表为空，抛出NoSuchElementException.
	getLast();
	jdk1.6
	peekFirst();//获取但不移除，如果链表为空，返回null.
	peekLast():

	removeFirst();//获取并移除，如果链表为空，抛出NoSuchElementException.
	removeLast();
	jdk1.6
	pollFirst();//获取并移除，如果链表为空，返回null.
	pollLast();



作业：
1，自己去查文档演示Vector中的elements()方法。

2，LinkedList中的，addFirst addLast getFirst，getLast  removeFirst removeLast。

3，既然集合是存储对象的，请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
并取出。将姓名和年龄打印出来。




---------------------------------------------

Set:元素不可以重复，是无序。
	Set接口中的方法和Collection一致。
	|--HashSet: 内部数据结构是哈希表 ，是不同步的。
		如何保证该集合的元素唯一性呢？
		是通过对象的hashCode和equals方法来完成对象唯一性的。
		如果对象的hashCode值不同，那么不用判断equals方法，就直接存储到哈希表中。
		如果对象的hashCode值相同，那么要再次判断对象的equals方法是否为true。
		如果为true，视为相同元素，不存。如果为false，那么视为不同元素，就进行存储。

		记住：如果元素要存储到HashSet集合中，必须覆盖hashCode方法和equals方法。
		一般情况下，如果定义的类会产生很多对象，比如人，学生，书，通常都需要覆盖equals，hashCode方法。
		建立对象判断是否相同的依据。




	|--TreeSet:可以对Set集合中的元素进行排序。是不同步的。
				判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。

				TreeSet对元素进行排序的方式一：
				让元素自身具备比较功能，元就需要实现Comparable接口。覆盖compareTo方法。

				如果不要按照对象中具备的自然顺序进行排序。如果对象中不具备自然顺序。怎么办？
				可以使用TreeSet集合第二种排序方式二：
				让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。
				将该类对象作为参数传递给TreeSet集合的构造函数。




if(this.hashCode()== obj.hashCode() && this.equals(obj))



哈希表确定元素是否相同
1，判断的是两个元素的哈希值是否相同。
	如果相同，在判断两个对象的内容是否相同。

2，判断哈希值相同，其实判断的是对象的hashCode的方法。判断内容相同，用的是equals方法。

注意：如果哈希值不同，是不需要判断equals。

## day18
集合类的由来：
	对象用于封装特有数据，对象多了需要存储，如果对象的个数不确定。
	就使用集合容器进行存储。

集合特点：
1，用于存储对象的容器。
2，集合的长度是可变的。
3，集合中不可以存储基本数据类型值。



集合容器因为内部的数据结构不同，有多种具体容器。
不断的向上抽取，就形成了集合框架。

框架的顶层Collection接口：

Collection的常见方法：

1，添加。
	boolean add(Object obj):
	boolean addAll(Collection coll):


2，删除。
	boolean remove(object obj):
	boolean removeAll(Collection coll);
	void clear();

3，判断：
	boolean contains(object obj):
	boolean containsAll(Colllection coll);
	boolean isEmpty():判断集合中是否有元素。

4，获取：
	int size():
	Iterator iterator():取出元素的方式：迭代器。
	该对象必须依赖于具体容器，因为每一个容器的数据结构都不同。
	所以该迭代器对象是在容器中进行内部实现的。
	对于使用容器者而言，具体的实现不重要，只要通过容器获取到该实现的迭代器的对象即可，
	也就是iterator方法。

	Iterator接口就是对所有的Collection容器进行元素取出的公共接口。
	其实就是抓娃娃游戏机中的夹子！


5，其他：
	boolean retainAll(Collection coll);取交集。
	Object[] toArray():将集合转成数组。


-------------------------------
Collection
	|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
	|--Set：元素不能重复,无序。


List:特有的常见方法：有一个共性特点就是都可以操作角标。

1，添加
	void add(index,element);
	void add(index,collection);


2，删除；
	Object remove(index):


3，修改：
	Object set(index,element);


4，获取：
	Object get(index);
	int indexOf(object);
	int lastIndexOf(object);
	List subList(from,to);


list集合是可以完成对元素的增删改查。


List:
	|--Vector:内部是数组数据结构，是同步的。增删，查询都很慢！
	|--ArrayList:内部是数组数据结构，是不同步的。替代了Vector。查询的速度快。
	|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。



LinkedList:

	addFirst();
	addLast():
	jdk1.6
	offerFirst();
	offetLast();


	getFirst();.//获取但不移除，如果链表为空，抛出NoSuchElementException.
	getLast();
	jdk1.6
	peekFirst();//获取但不移除，如果链表为空，返回null.
	peekLast():

	removeFirst();//获取并移除，如果链表为空，抛出NoSuchElementException.
	removeLast();
	jdk1.6
	pollFirst();//获取并移除，如果链表为空，返回null.
	pollLast();



作业：
1，自己去查文档演示Vector中的elements()方法。

2，LinkedList中的，addFirst addLast getFirst，getLast  removeFirst removeLast。

3，既然集合是存储对象的，请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
并取出。将姓名和年龄打印出来。




---------------------------------------------

Set:元素不可以重复，是无序。
	Set接口中的方法和Collection一致。
	|--HashSet: 内部数据结构是哈希表 ，是不同步的。
		如何保证该集合的元素唯一性呢？
		是通过对象的hashCode和equals方法来完成对象唯一性的。
		如果对象的hashCode值不同，那么不用判断equals方法，就直接存储到哈希表中。
		如果对象的hashCode值相同，那么要再次判断对象的equals方法是否为true。
		如果为true，视为相同元素，不存。如果为false，那么视为不同元素，就进行存储。

		记住：如果元素要存储到HashSet集合中，必须覆盖hashCode方法和equals方法。
		一般情况下，如果定义的类会产生很多对象，比如人，学生，书，通常都需要覆盖equals，hashCode方法。
		建立对象判断是否相同的依据。




	|--TreeSet:可以对Set集合中的元素进行排序。是不同步的。
				判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。

				TreeSet对元素进行排序的方式一：
				让元素自身具备比较功能，元就需要实现Comparable接口。覆盖compareTo方法。

				如果不要按照对象中具备的自然顺序进行排序。如果对象中不具备自然顺序。怎么办？
				可以使用TreeSet集合第二种排序方式二：
				让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。
				将该类对象作为参数传递给TreeSet集合的构造函数。




if(this.hashCode()== obj.hashCode() && this.equals(obj))



哈希表确定元素是否相同
1，判断的是两个元素的哈希值是否相同。
	如果相同，在判断两个对象的内容是否相同。

2，判断哈希值相同，其实判断的是对象的hashCode的方法。判断内容相同，用的是equals方法。

注意：如果哈希值不同，是不需要判断equals。



-------------------------------------------------------

泛型：
	jdk1.5出现的安全机制。

好处：
	1，将运行时期的问题ClassCastException转到了编译时期。
	2，避免了强制转换的麻烦。

<>:什么时候用？当操作的引用数据类型不确定的时候。就使用<>。将要操作的引用数据类型传入即可.
   其实<>就是一个用于接收具体引用数据类型的参数范围。

在程序中，只要用到了带有<>的类或者接口，就要明确传入的具体引用数据类型 。

泛型技术是给编译器使用的技术,用于编译时期。确保了类型的安全。

运行时，会将泛型去掉，生成的class文件中是不带泛型的,这个称为泛型的擦除。
为什么擦除呢？因为为了兼容运行的类加载器。

泛型的补偿：在运行时，通过获取元素的类型进行转换动作。不用使用者在强制转换了。


泛型的通配符：? 未知类型。

泛型的限定：
? extends E: 接收E类型或者E的子类型对象。上限
一般存储对象的时候用。比如 添加元素 addAll.

? super E: 接收E类型或者E的父类型对象。 下限。
一般取出对象的时候用。比如比较器。

===========================================================

集合的一些技巧：

需要唯一吗？
需要：Set
	需要制定顺序：
			需要： TreeSet
			不需要：HashSet
			但是想要一个和存储一致的顺序(有序):LinkedHashSet
不需要：List
	需要频繁增删吗？
		需要：LinkedList
		不需要：ArrayList

如何记录每一个容器的结构和所属体系呢？

看名字！


List
	|--ArrayList
	|--LinkedList

Set
	|--HashSet
	|--TreeSet

后缀名就是该集合所属的体系。

前缀名就是该集合的数据结构。

看到array：就要想到数组，就要想到查询快，有角标.
看到link：就要想到链表，就要想到增删快，就要想要 add get remove+frist last的方法
看到hash:就要想到哈希表，就要想到唯一性，就要想到元素需要覆盖hashcode方法和equals方法。
看到tree：就要想到二叉树，就要想要排序，就要想到两个接口Comparable，Comparator 。

而且通常这些常用的集合容器都是不同步的。


============================================

Map：一次添加一对元素。Collection 一次添加一个元素。
	Map也称为双列集合，Collection集合称为单列集合。
	其实map集合中存储的就是键值对。
	map集合中必须保证键的唯一性。


常用方法：
1，添加。
	value put(key,value):返回前一个和key关联的值，如果没有返回null.

2，删除。
	void  clear():清空map集合。
	value remove(key):根据指定的key翻出这个键值对。

3，判断。
	boolean containsKey(key):
	boolean containsValue(value):
	boolean isEmpty();

4，获取。
	value get(key):通过键获取值，如果没有该键返回null。
					当然可以通过返回null，来判断是否包含指定键。
	int size(): 获取键值对的个数。



Map常用的子类：
	|--Hashtable :内部结构是哈希表，是同步的。不允许null作为键，null作为值。
		|--Properties：用来存储键值对型的配置文件的信息，可以和IO技术相结合。
	|--HashMap : 内部结构是哈希表，不是同步的。允许null作为键，null作为值。
	|--TreeMap : 内部结构是二叉树，不是同步的。可以对Map集合中的键进行排序。

day18 学习结果：

1，泛型类，泛型方法，泛型接口什么时候用？并举例！

2，泛型的通配符，以及泛型的限定的表现形式，和用法，以及什么时候用？
	? extends E: 存储元素对象的时候用，你定义的是E类型，我们可以存储E类型或者E的子类型的对象。
	? super E:从容器中取出元素时使用，容器中有E类型对象，取出时可使用E类型接收，或者E的父类型接收。比如比较器。

3，泛型的细节作为了解？

4，要求api中涉及泛型限定的方法一定要看的懂并会用，比如TreeSet集合的构造函数。

5，Map集合的特点以及常见子类的特点？

6，Map集合中，取出所有元素原理，以及keySet,entrySet方法的使用，必须会？

7，Map集合和Collection集合的区别？
	1，
	Map中一次存储是键值对。
	Collection中一次存储是单个元素。
	2，
	Map的存储使用的put方法。
	Collection存储使用的是add方法。
	3，
	Map的取出，是讲Map转成Set，在使用迭代器取出。
	Collection取出，使用就是迭代器。
	4，
	如果对象很多，必须使用容器存储。
	如果元素存在着映射关系，可以优先考虑使用Map存储或者用数组，
	如果没有映射关系，可以使用Collection存储。


8，Map集合的使用场景。要求，将常见的体现之一：查表法回顾一下，并用map集合完成一次查表法。


练习:
"fdgavcbsacdfs" 获取该字符串中，每一个字母出现的次数。
要求打印结果是：a(2)b(1)...;




## day19
day19 学习结果：

1，Map和Collection的区别？

2，Map的练习(字母次数)，明确查表的应用，注重思想？

3，Collecitons中常见方法举例？

4，Collection和Collections的区别？

5，Arrays常见方法？

6，数组和集合转换，数组转集合为什么？集合转数组为什么？要注意什么？

7，增强for循环和传统for循环的区别？foreach可以遍历map吗？

8，可变参数的使用方式，和注意事项，并举例？

9，System类中获取本地系统信息的方法。

10，Runtime api查阅时，你看到了什么，想到了什么？

11，Math中的常见方法使用？

集合类的由来：
	对象用于封装特有数据，对象多了需要存储，如果对象的个数不确定。
	就使用集合容器进行存储。

集合特点：
1，用于存储对象的容器。
2，集合的长度是可变的。
3，集合中不可以存储基本数据类型值。



集合容器因为内部的数据结构不同，有多种具体容器。
不断的向上抽取，就形成了集合框架。

框架的顶层Collection接口：

Collection的常见方法：

1，添加。
	boolean add(Object obj):
	boolean addAll(Collection coll):


2，删除。
	boolean remove(object obj):
	boolean removeAll(Collection coll);
	void clear();

3，判断：
	boolean contains(object obj):
	boolean containsAll(Colllection coll);
	boolean isEmpty():判断集合中是否有元素。

4，获取：
	int size():
	Iterator iterator():取出元素的方式：迭代器。
	该对象必须依赖于具体容器，因为每一个容器的数据结构都不同。
	所以该迭代器对象是在容器中进行内部实现的。
	对于使用容器者而言，具体的实现不重要，只要通过容器获取到该实现的迭代器的对象即可，
	也就是iterator方法。

	Iterator接口就是对所有的Collection容器进行元素取出的公共接口。
	其实就是抓娃娃游戏机中的夹子！


5，其他：
	boolean retainAll(Collection coll);取交集。
	Object[] toArray():将集合转成数组。


-------------------------------
Collection
	|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
	|--Set：元素不能重复,无序。


List:特有的常见方法：有一个共性特点就是都可以操作角标。

1，添加
	void add(index,element);
	void add(index,collection);


2，删除；
	Object remove(index):


3，修改：
	Object set(index,element);


4，获取：
	Object get(index);
	int indexOf(object);
	int lastIndexOf(object);
	List subList(from,to);


list集合是可以完成对元素的增删改查。


List:
	|--Vector:内部是数组数据结构，是同步的。增删，查询都很慢！
	|--ArrayList:内部是数组数据结构，是不同步的。替代了Vector。查询的速度快。
	|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。



LinkedList:

	addFirst();
	addLast():
	jdk1.6
	offerFirst();
	offetLast();


	getFirst();.//获取但不移除，如果链表为空，抛出NoSuchElementException.
	getLast();
	jdk1.6
	peekFirst();//获取但不移除，如果链表为空，返回null.
	peekLast():

	removeFirst();//获取并移除，如果链表为空，抛出NoSuchElementException.
	removeLast();
	jdk1.6
	pollFirst();//获取并移除，如果链表为空，返回null.
	pollLast();



作业：
1，自己去查文档演示Vector中的elements()方法。

2，LinkedList中的，addFirst addLast getFirst，getLast  removeFirst removeLast。

3，既然集合是存储对象的，请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
并取出。将姓名和年龄打印出来。




---------------------------------------------

Set:元素不可以重复，是无序。
	Set接口中的方法和Collection一致。
	|--HashSet: 内部数据结构是哈希表 ，是不同步的。
		如何保证该集合的元素唯一性呢？
		是通过对象的hashCode和equals方法来完成对象唯一性的。
		如果对象的hashCode值不同，那么不用判断equals方法，就直接存储到哈希表中。
		如果对象的hashCode值相同，那么要再次判断对象的equals方法是否为true。
		如果为true，视为相同元素，不存。如果为false，那么视为不同元素，就进行存储。

		记住：如果元素要存储到HashSet集合中，必须覆盖hashCode方法和equals方法。
		一般情况下，如果定义的类会产生很多对象，比如人，学生，书，通常都需要覆盖equals，hashCode方法。
		建立对象判断是否相同的依据。




	|--TreeSet:可以对Set集合中的元素进行排序。是不同步的。
				判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。

				TreeSet对元素进行排序的方式一：
				让元素自身具备比较功能，元就需要实现Comparable接口。覆盖compareTo方法。

				如果不要按照对象中具备的自然顺序进行排序。如果对象中不具备自然顺序。怎么办？
				可以使用TreeSet集合第二种排序方式二：
				让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。
				将该类对象作为参数传递给TreeSet集合的构造函数。




if(this.hashCode()== obj.hashCode() && this.equals(obj))



哈希表确定元素是否相同
1，判断的是两个元素的哈希值是否相同。
	如果相同，在判断两个对象的内容是否相同。

2，判断哈希值相同，其实判断的是对象的hashCode的方法。判断内容相同，用的是equals方法。

注意：如果哈希值不同，是不需要判断equals。



-------------------------------------------------------

泛型：
	jdk1.5出现的安全机制。

好处：
	1，将运行时期的问题ClassCastException转到了编译时期。
	2，避免了强制转换的麻烦。

<>:什么时候用？当操作的引用数据类型不确定的时候。就使用<>。将要操作的引用数据类型传入即可.
   其实<>就是一个用于接收具体引用数据类型的参数范围。

在程序中，只要用到了带有<>的类或者接口，就要明确传入的具体引用数据类型 。

泛型技术是给编译器使用的技术,用于编译时期。确保了类型的安全。

运行时，会将泛型去掉，生成的class文件中是不带泛型的,这个称为泛型的擦除。
为什么擦除呢？因为为了兼容运行的类加载器。

泛型的补偿：在运行时，通过获取元素的类型进行转换动作。不用使用者在强制转换了。


泛型的通配符：? 未知类型。

泛型的限定：
? extends E: 接收E类型或者E的子类型对象。上限
一般存储对象的时候用。比如 添加元素 addAll.

? super E: 接收E类型或者E的父类型对象。 下限。
一般取出对象的时候用。比如比较器。

===========================================================

集合的一些技巧：

需要唯一吗？
需要：Set
	需要制定顺序：
			需要： TreeSet
			不需要：HashSet
			但是想要一个和存储一致的顺序(有序):LinkedHashSet
不需要：List
	需要频繁增删吗？
		需要：LinkedList
		不需要：ArrayList

如何记录每一个容器的结构和所属体系呢？

看名字！


List
	|--ArrayList
	|--LinkedList

Set
	|--HashSet
	|--TreeSet

后缀名就是该集合所属的体系。

前缀名就是该集合的数据结构。

看到array：就要想到数组，就要想到查询快，有角标.
看到link：就要想到链表，就要想到增删快，就要想要 add get remove+frist last的方法
看到hash:就要想到哈希表，就要想到唯一性，就要想到元素需要覆盖hashcode方法和equals方法。
看到tree：就要想到二叉树，就要想要排序，就要想到两个接口Comparable，Comparator 。

而且通常这些常用的集合容器都是不同步的。


============================================

Map：一次添加一对元素。Collection 一次添加一个元素。
	Map也称为双列集合，Collection集合称为单列集合。
	其实map集合中存储的就是键值对。
	map集合中必须保证键的唯一性。


常用方法：
1，添加。
	value put(key,value):返回前一个和key关联的值，如果没有返回null.

2，删除。
	void  clear():清空map集合。
	value remove(key):根据指定的key翻出这个键值对。

3，判断。
	boolean containsKey(key):
	boolean containsValue(value):
	boolean isEmpty();

4，获取。
	value get(key):通过键获取值，如果没有该键返回null。
					当然可以通过返回null，来判断是否包含指定键。
	int size(): 获取键值对的个数。



Map常用的子类：
	|--Hashtable :内部结构是哈希表，是同步的。不允许null作为键，null作为值。
		|--Properties：用来存储键值对型的配置文件的信息，可以和IO技术相结合。
	|--HashMap : 内部结构是哈希表，不是同步的。允许null作为键，null作为值。
	|--TreeMap : 内部结构是二叉树，不是同步的。可以对Map集合中的键进行排序。








List list = new ArrayList();//非同步的。

list = MyCollections.synList(list);//返回一个同步的list.







给非同步的集合加锁。

class MyCollections{

	public static  List synList(List list){

		return new MyList(list);
	}

	private class MyList implements List{
	private List list;

	private static final Object lock = new Object();
	MyList(List list){
		this.list = list;
	}

	public boolean add(Object obj){
		synchronized(lock)
		{
			return list.add(obj);
		}
	}

	public boolean remove(Object obj){
		synchronized(lock)
		{
			return list.remove(obj);
		}
	}

}
}















## day20


1，日期类和日历类。
	日期对象Date和毫秒值之间的转换，以及什么时候用？
	日期对象Date和日期格式的字符串之间的转换，以及什么时候用？
	并明确多涉及的方法。完成练习。

	练习：
	2012/2/16-2012/3/5有多天？

	日历类的日期的设置，获取，偏移。

2，输入流和输出流的流向的理解？

3，字符流的理解，由来和作用？

4，什么时候使用流对象？

5，对字符流中的具体操作文件的流对象进行熟悉？
	并明确每一个操作步骤和原理。

6，复制文件的原理和代码。

7，IO异常的处理方式每一个步骤要理解？

8，缓冲区的基本思想？提高效率的原理。

输入流和输出流相对于内存设备而言.

将外设中的数据读取到内存中:输入
将内存的数写入到外设中：输出。


字符流的由来：
其实就是：字节流读取文字字节数据后，不直接操作而是先查指定的编码表。获取对应的文字。
在对这个文字进行操作。简单说：字节流+编码表

---------------------------------------

字节流的两个顶层父类：
1，InputStream  2，OutputStream.

字符流的两个顶层父类：
1，Reader 2，Writer

这些体系的子类都以父类名作为后缀。
而且子类名的前缀就是该对象的功能。





就从熟悉的文字开始字符流，


//需求：将一些文字存储到硬盘一个文件中。
记住；如果要操作文字数据，建议优先考虑字符流。
而且要将数据从内存写到硬盘上，要使用字符流中的输出流。Writer
硬盘的数据基本体现是文件。 希望找到一个可以操作文件的Writer.

找到了FileWriter



//需求：读取一个文本文件。将读取到的字符打印到控制台.
同上，找到了FileReader



作业：将c盘的一个文本文件复制到d盘。


## day21


输入流和输出流相对于内存设备而言.

将外设中的数据读取到内存中:输入
将内存的数写入到外设中：输出。


字符流的由来：
其实就是：字节流读取文字字节数据后，不直接操作而是先查指定的编码表。获取对应的文字。
在对这个文字进行操作。简单说：字节流+编码表

---------------------------------------

字节流的两个顶层父类：
1，InputStream  2，OutputStream.

字符流的两个顶层父类：
1，Reader 2，Writer

这些体系的子类都以父类名作为后缀。
而且子类名的前缀就是该对象的功能。





就从熟悉的文字开始字符流，


//需求：将一些文字存储到硬盘一个文件中。
记住；如果要操作文字数据，建议优先考虑字符流。
而且要将数据从内存写到硬盘上，要使用字符流中的输出流。Writer
硬盘的数据基本体现是文件。 希望找到一个可以操作文件的Writer.

找到了FileWriter



//需求：读取一个文本文件。将读取到的字符打印到控制台.
同上，找到了FileReader



作业：将c盘的一个文本文件复制到d盘。
分析：
复制原理：
读取c盘文件中的数据，
将这些数据写入到d盘当中。
连读带写。



==========================

字符流缓冲区：
BufferedWriter
	：newLine();

BufferedReader:
	: readLine();


使用缓冲区复制一个文本文件。



装饰设计模式：
	对一组对象的功能进行增强时，就可以使用该模式进行问题的解决。


装饰和继承都能实现一样的特点：进行功能的扩展增强。

有什么区别呢？

首先有一个继承体系。
Writer
	|--TextWriter:用于操作文本
	|--MediaWriter：用于操作媒体。

想要对操作的动作进行效率的提高。
按照面向对象，可以通过继承对具体的进行功能的扩展。
效率提高需要加入缓冲技术。

Writer
	|--TextWriter:用于操作文本
		|--BufferTextWriter:加入了缓冲技术的操作文本的对象。
	|--MediaWriter：用于操作媒体。
		|--BufferMediaWriter:

到这里就哦了。但是这样做好像并不理想。
如果这个体系进行功能扩展，有多了流对象。
那么这个流要提高效率，是不是也要产生子类呢？是。这时就会发现只为提高功能，进行的继承，
导致继承体系越来越臃肿。不够灵活。

重新思考这个问题？
既然加入的都是同一种技术--缓冲。
前一种是让缓冲和具体的对象相结合。
可不可以将缓冲进行单独的封装，哪个对象需要缓冲就将哪个对象和缓冲关联。

class Buffer{
	Buffer(TextWriter w)
	{}

	Buffer(MediaWirter w)
	{

	}
}
class BufferWriter extends Writer{
	BufferWriter(Writer w)
	{
	}
}
Writer
	|--TextWriter:用于操作文本
	|--MediaWriter：用于操作媒体。
	|--BufferWriter:用于提高效率。

装饰比继承灵活。

特点：装饰类和被装饰类都必须所属同一个接口或者父类。



--------------------------------------

字节流：

InputStream


OutputStream

字节流：
FileInputStream
FileOutputStream
BufferedInputStream
BufferedOutputStream
字符流：
Writer Reader
FileReader
FileWriter
BufferedReader
BufferedWriter


1，BufferedReader ，BufferedWriter.高效的体现？
	内部将数组进行封装。
	变成对象后，方便于对缓冲区的操作。提高效率。
	并提供了对文本便捷操作的方法。
	readLine
	newLine。

2，自定义缓冲区，MyBufferedReader

3，readLine方法的原理。

4，装饰设计模式，以及和继承的区别？

5，字节流的基本应用？复制MP3的例子。

6，使用字符流可以复制图片吗？为什么？

7，转换流的由来？
	转换流是字符和字节之间桥梁。
	转换流将字节流和编码表进行了封装，提供了对字符操作的更便捷方式。


8，转换流的两个桥梁都是从哪里到哪里？

9，转换流的另一个功能，编码的体现？

10，转换流的子类和转换流的区别？

InputStreamReader   字节-->字符
	|--FileReader : 字节流+本地默认码表。

OutputStreamWriter  字符-->字节
	|--FileWriter


## day21














