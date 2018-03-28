/**
 * @createTime: 2018年3月22日
 */
package com.swk.datastruct;

import java.util.Arrays;

/**
 * @classDesc: 类描述: 插入排序
 * @author vico
 * @createTime 2018年3月22日 下午10:44:34
 * @version v1.0.0
 */
public class InsertSort {

	public void insertSort(int[] arry)
	{
		int sentry=arry[0];
		for(int i=1;i<arry.length;i++)
		{
			if(arry[i]<arry[i-1])
			{
				sentry=arry[i];
				int j;
				for( j=i-1;sentry<arry[j];--j)
				{
					arry[j+1]=arry[j];
				}
				arry[j+1]=sentry;
				
			}
		}
	}
	
	public static void main(String[] args) {
		InsertSort insertSort=new InsertSort();
		int[] arry=new int[]{1,5,9,11,45,36,89,95,45,65,258,38};
		System.out.println(Arrays.toString(arry));
		insertSort.insertSort(arry);
		System.out.println(Arrays.toString(arry));
	}
}
