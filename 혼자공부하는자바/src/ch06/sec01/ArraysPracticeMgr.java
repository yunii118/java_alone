package ch06.sec01;

public class ArraysPracticeMgr {

	public static void main(String[] args) {
		String[] studentName = {"홍길동", "홍이동", "홍삼동", "홍사동", "홍오동"};
		
		for(int i= 0;i<studentName.length;i++) {
			System.out.println(studentName[i]);
		}
		
		int[] korScor = {90, 85, 93, 95, 87};
		int max = 0;
		int maxInd = 0;
		int min = 100;
		int minInd = 0;
		int sum = 0;
		
		
		for(int j = 0;j<korScor.length;j++) {
			if(max<korScor[j]) {
				max = korScor[j];
				maxInd = j;
			}
			if(min>korScor[j]) {
				min = korScor[j];
				minInd = j;
			}
		}
		for(int k = 0;k<korScor.length;k++) {
			sum+= korScor[k];
		}
		double avg = (double)sum/korScor.length;
		String maxStudent = studentName[maxInd];
		String minStudent = studentName[minInd];
		
		
		String msg = """
				총점 = $sum
				평균 = $avg
				최고점수 = $max
				최고점수학생 = $maxStudent
				최저점수 = $min
				최저점수 학생 = $minStudent
				
				""";
		
		//chaining 패턴
		msg = msg.replace("$sum", ""+sum)
				.replace("$avg", ""+avg)
				.replace("$max", ""+max)
				.replace("$maxStudent", ""+maxStudent)
				.replace("$min", ""+min)
				.replace("$minStudent", ""+minStudent);
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("가장 높은 국어 점수 : "+max+", 가장 낮은 국어 점수 : "+min);
		System.out.println("가장 높은 국어 점수를 기록한 학생은 "+studentName[maxInd]+"입니다.");
		System.out.println(msg);
		
		
		

	}

}
