/*====================
 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
=====================*/

// �۰���
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� �����ϴ� ������ ����ϴ� ������
// ������ �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
/*
	E	J	O	T	Y
	D	I	H	S	X
	C	H	M	R	W
	B	G	L	Q	V
	A	F	K	P	U
����Ϸ��� �ƹ� Ű�� ��������..
*/

// i=4,j=0 �� i=3, j=0 ��...�� i=0, j=0 �� i=0, j=1
// i=4 -> j=0 , i=3 -> j=1, i=2 -> j=2, i=1 -> j=3, i=0 -> j=4

							
/*						
B	4,1 ->	F	3,0
C	4,2	->	K	2,0
D	4,3 ->	P	1,0
E	4,4	->	U	0,0

H	3,2 ->	L	2,1
I	3,3 ->	Q	1,1
J	3,4	->	V	0,1

*/

public class Test094
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n = 65;
		
		for (int i=4; i>=0; i--)
		{
			for (int j=0; j<=4; j++)
			{
				
				arr[4-j][4-i] = n;		//	i -> 4-j,	j -> 4-i
				n++;
			}
			
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", (char)arr[i][j]);
			}
			System.out.println();
		}
	}
}
// ���� ���
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/