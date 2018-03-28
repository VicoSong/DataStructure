/**
 * @createTime: 2018年3月22日
 */
package com.swk.datastruct;

import java.util.Arrays;

/**
 * @classDesc: 类描述: 希尔排序
 * @author vico
 * @createTime 2018年3月22日 下午11:39:36
 * @version v1.0.0
 */
public class ShellInsert {

	/**
	 * @methodDesc: 方法描述: 对数组做一趟希尔插入排序
	 *              1.前后记录位置的增量是dk
	 * @author vico
	 * @createTime 2018年3月22日 下午11:40:45
	 * @version v1.0.0
	 * @param arry
	 * @param dk
	 *
	 */
	public void shellInsert(int[] arry,int dk)
	{
		int sentry=arry[0];
		for(int i= dk;i<arry.length;++i)
		{
			if(arry[i]<arry[i-dk])
			{
				sentry=arry[i];
				int j;
				for( j= i-dk; j>=0&&sentry<arry[j];j-=dk)
				{
					arry[j+dk]=arry[j];
				}
				arry[j+dk]=sentry;
			}
		}
	}
	
	/**
	 * @methodDesc: 方法描述: 按增量序列dlta[0...t-1]对顺序表arry做希尔排序
	 * @author vico
	 * @createTime 2018年3月22日 下午11:49:17
	 * @version v1.0.0
	 * @param arry
	 * @param dlta
	 *
	 */
	public void shellSort(int[] arry,int[] dlta)
	{
		for(int k=0;k<dlta.length;k++)
			shellInsert(arry, dlta[k]);
	}
	
	public static void main(String[] args) {
		int[] arry=new int[]{7,5,8,48,98,3,9,6,89,75,1,2,31,21,65};
		int[] dlta=new int[]{11,7,5,3,2,1};
		new ShellInsert().shellSort(arry, dlta);
	    System.out.println(Arrays.toString(arry)); 
	}
	
}
