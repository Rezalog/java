/*====================
 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
=====================*/




public class Test087
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ����� ����, �ʱ�ȭ

		// ��� ��
		//int[] arr1 = new int[3];
		int[][] arr1 = new int[3][3];

		//arr1[0] = 1;		1�����϶� �ʱ�ȭ���
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;
							// 2�����϶� �ʱ�ȭ

		
		// ��� ��
		// int[] arr2 = {1, 2, 3};							// 1�����϶�
		int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		// ��� ��
		int[][] arr3 = new int[3][3];
		int n=1;

		for (int i=0; i<arr3.length; i++)		// ù��° �ݺ��� ->  0   1   2
		{
			for (int j=0; j<arr3[i].length; j++)	// �ι�° �ݺ��� -> 012 012 012
			{
				// �׽�Ʈ
				// System.out.rpitnln("i:" + i + ", j:" +j);
				arr3[i][j] = n;	// 00=1 01=2 02=3 ... 12=6 ...
				n++;
			}
		}
		
		// �迭�� �迭 ��� ��ü ���
		for (int i=0; i<arr3.length; i++)
		{
			for (int j=0; j<arr3[i].length; j++)
			{
				System.out.printf("%2d", arr3[i][j]);
			}
			System.out.println();
		}
		System.out.println();




	}
}