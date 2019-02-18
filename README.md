# 《剑指offer》题目——使用Java实现
***
> Solutions to the book《Coding Interviews》with Java.

>《剑指offer—名企面试官精讲典型编程题》题目的Java实现。

| No | Title | Question | Solution |
|:--------|:--------:|--------|:--------:|
|01|赋值运算符函数||:no_entry:|
|02|实现Singleton模式||:no_entry:|
|03|FindInPartiallySortedMatrix<br>二维数组中的查找|在一个二维数组中，每一行按照从左到右递增的顺序排序，每一列按照从上到下递增的顺序排序。请完成一个函数，输入上述二维数组和一个整数，判断数组中是否含有该整数。|[Q3_FindMatrix.java](Q3_FindMatrix.java)|
|05|PrintListReversingly<br>从尾到头打印链表|输入一个链表的头节点，从尾到头反过来打印每个节点的值。链表节点定义见[Q5_PrintListReversingly.java](Q5_PrintListReversingly.java)|[Q5_PrintListReversingly.java](Q5_PrintListReversingly.java)|
|06|ReConstructBinaryTree<br>重建二叉树|输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列`{1,2,4,7,3,5,6,8}`和中序遍历序列`{4,7,2,1,5,3,8,6}`，则重建二叉树并返回。|[Q6_ReConstructBinaryTree.java](Q6_ReConstructBinaryTree.java)|
|07|QueueWithTwoStack<br>用两个栈实现队列|用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。|[Q7_QueueWithTwoStack.java](Q7_QueueWithTwoStack.java)|
|08|MinNumberInRotateArray<br>旋转数组的最小数字|把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增序列(可能存在重复值)的一个旋转，输出旋转数组的最小元素。例如数组`{3,4,5,1,2}`为`{1,2,3,4,5}`的一个旋转，该数组的最小值为1。|[Q8_MinNumberInRotateArray.java](Q8_MinNumberInRotateArray.java)|
|09|Fibonacci<br>斐波那契数列|大家都知道斐波那契数列,要求输入一个整数n，请你输出斐波那契数列的第n项。|[Q9_Fibonacci.java](Q9_Fibonacci.java)|
|09.1|JumpFloor<br>跳台阶|一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。|[Q9.1_JumpFloor.java](Q9.1_JumpFloor.java)|
|09.2|JumpFloorII<br>变态跳台阶|一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。|[Q9.2_JumpFloorII.java](Q9.2_JumpFloorII.java)|
|09.3|RectCover<br>矩形覆盖|我们可以用`2*1`的小矩形横着或者竖着去覆盖更大的矩形。请问用n个`2*1`的小矩形无重叠地覆盖一个`2*n`的大矩形，总共有多少种方法？|[Q9.3_RectCover.java](Q9.3_RectCover.java)|
|10|NumberOf1<br>二进制中1的个数|输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。|[Q10_NumberOf1.java](Q10_NumberOf1.java)|
|11|Power<br>数值的整数次方|给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。|[Q11_Power.java](Q11_Power.java)|
|12|打印1到最大的n位数||:soon:|
|13|在O(1)时间删除链表结点||:soon:|
|14|调整数组顺序使奇数位于偶数前面|输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。|[Q14_ReOrderArray.java](Q14_ReOrderArray.java)|
|15|链表中倒数第k个结点|输入一个链表，输出该链表中倒数第k个结点。|[Q15_FindKthToTail.java](Q15_FindKthToTail.java)|
|16|反转链表|输入一个链表，反转链表后，输出新链表的表头。|[Q16_ReverseList.java](Q16_ReverseList.java)|
|17|合并两个排序的链表|输入两个递增排序的链表，合并这两个链表并使新链表的结点仍然是按照递增排序的。|[Q17_MergeSortedLists.java](Q17_MergeSortedLists.java)<br>[Q17_MergeSortedLists_Recursive.java](Q17_MergeSortedLists_Recursive.java)|
|18|树的子结构|输入两棵二叉树A，B，判断B是不是A的子结构。(空树不是任意一个树的子结构)|[Q18_SubstructureInTree.java](Q18_SubstructureInTree.java)|
|19|二叉树的镜像|请完成一个函数，输入一个二叉树，该函数输出它的镜像|[Q19_MirrorOfBinaryTree.java](Q19_MirrorOfBinaryTree.java)|
|20|顺时针打印矩阵||:soon:|
|21|包含min函数的栈||:soon:|
|22|栈的压入、弹出序列||:soon:|
|23|从上往下打印二叉树||:soon:|
|24|二叉搜索树的后序遍历序列||:soon:|
|25|二叉树中和为某一值的路径||:soon:|
|26|复杂链表的复制||:soon:|
|27|二叉搜索树与双向链表||:soon:|
|28|字符串的排列||:soon:|
|29|数组中出现次数超过一半的数字||:soon:|
|30|最小的k个数||:soon:|
