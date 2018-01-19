# 《剑指offer》题目——使用Java实现
***
> Solutions to the book《Coding Interviews》with Java.

>《剑指offer》题目的Java实现。

#### Question03:FindInPartiallySortedMatrix
#### 面试题3:二维数组中的查找
**题目:** 在一个二维数组中，每一行按照从左到右递增的顺序排序，每一列按照从上到下递增的顺序排序。请完成一个函数，输入上述二维数组和一个整数，判断数组中是否含有该整数。

**解决方案:**见Q3_FindMatrix.java

#### Question05:PrintListReversingly
#### 面试题5:从尾到头打印链表
**题目:**输入一个链表的头节点，从尾到头反过来打印每个节点的值。链表节点定义如下：

```java
static class Node{
  Node next;
  int data;
}
```
**解决方案:**见Q5_PrintListReversingly.java

#### Question06:ReConstructBinaryTree
#### 面试题6:重建二叉树
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

**解决方案:**见Q6_ReConstructBinaryTree.java

#### Question07:QueueWithTwoStack
#### 面试题7:用两个栈实现队列
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

**解决方案:**见Q7_QueueWithTwoStack.java

#### Question08:MinNumberInRotateArray
#### 面试题8:旋转数组的最小数字
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增序列(可能存在重复值)的一个旋转，输出旋转数组的最小元素。例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。

**解决方案:**见Q8_MinNumberInRotateArray.java

#### Question09:Fibonacci
#### 面试题9:斐波那契数列
大家都知道斐波那契数列,要求输入一个整数n，请你输出斐波那契数列的第n项。

**解决方案:**见Q9_Fibonacci.java

#### Question09.1:JumpFloor
#### 面试题9.1:跳台阶
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

**解决方案:**见Q9.1_JumpFloor.java

#### Question09.2:JumpFloorII
#### 面试题9.2:变态跳台阶
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

**解决方案:**见Q9.2_JumpFloorII.java

#### Question09.3:RectCover
#### 面试题9.3:矩形覆盖
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

**解决方案:**见Q9.3_RectCover.java

#### Question10:NumberOf1
#### 面试题10：二进制中1的个数
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
**解决方案:**见Q10_NumberOf1.java

#### Question11:Power
#### 面试题11：数值的整数次方
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
**解决方案:**见Q11_Power.java
