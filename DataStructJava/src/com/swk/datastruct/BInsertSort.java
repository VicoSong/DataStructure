/**
 * @createTime: 2018年3月22日
 */
package com.swk.datastruct;

import java.util.Arrays;

/**
 * @classDesc: 类描述: 折半插入排序
 * @author vico
 * @createTime 2018年3月22日 下午11:03:55
 * @version v1.0.0
 */
public class BInsertSort {
	
	public static void binsertSort(int[] arry)
	{
		int sentry=arry[0];
		for(int i=1;i<arry.length;i++)
		{
			sentry=arry[i];
			int low = 0;
			int high=i;
			while(low<=high)
			{
				int m=(low+high)/2;
				if(sentry<arry[m])
				{
					high=m-1;
				}else 
				{
					low = m+1;
				}
			}
			
			for(int j=i-1; j>high;--j)
			{
				arry[j+1] =arry[j];
			}
			arry[high+1] =sentry;
			
			
		}
	}
	
	public static void main(String[] args) {
		int[] arry = new int[] {85,1,5,9,3,6,7,8,54,25,36,69};
		BInsertSort.binsertSort(arry);
		System.out.println(Arrays.toString(arry));
	}
	
	
	
}
