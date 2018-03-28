/**
 * @createTime: 2018年3月14日
 */
package com.swk.datastruct;

/**
 * @classDesc: 类描述: 字符串操作类
 * @author vico
 * @createTime 2018年3月14日 上午7:11:26
 * @version v1.0.0
 */
public class StringMatch {

	/**
	 * @methodDesc: 方法描述:返回子串T在主串S中第pos个字符之后的位置。若不存在，则函数值为0
	 * @author vico
	 * @createTime 2018年3月14日 上午7:12:43
	 * @version v1.0.0
	 * @param s
	 * @param t
	 * @param pos
	 * @return
	 *
	 */
	public static int index(Character[] s,Character[] t,int pos)
	{
	   int i=pos;
	   int j=1;
	   while(i<s.length&&j<t.length)
	   {
		   if(s[i]==t[j])
		   {
			   ++i;
			   ++j;
		   }else 
		   {
			   i=i-j+2;
			   j=1;
		   }
	   }
	   if(j>t.length)
	   {
		   return i-t.length;
	   }else {
		   
		   return 0;
	   }
	   
	}
	
	/**
	 * @methodDesc: 方法描述: 利用模式串t的next函数求t在主串s中第pos个字符之后的位置的KMP算法
	 * @author vico
	 * @createTime 2018年3月14日 上午7:23:14
	 * @version v1.0.0
	 * @param s
	 * @param t
	 * @param pos
	 * @return
	 *
	 */
	public int indexKMP(char[] s, char[] t,int pos)
	{
		int i=pos;
		int j=1;
		return 0;
	}
	
}
