package javaBenchMark;
/**
 * 
 */

/**
 * Javaのベンチマークを行うプログラム
 */
public class bench {

	public static final long BENCHMARK_SIZE = 1000000000;
	public static final int BENCHMARK_TIMES = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 加算
		double time_average = 0;
		for(int i = 0; i < BENCHMARK_TIMES; ++i){
			time_average += (double) benchmarkAdd() / BENCHMARK_TIMES;			
		}
		System.out.printf("整数加算：%f(ms)\n", time_average);

		// 減算
		time_average = 0;
		for(int i = 0; i < BENCHMARK_TIMES; ++i){
			time_average += (double) benchmarkSub() / BENCHMARK_TIMES;			
		}
		System.out.printf("整数減算：%f(ms)\n", time_average);

		// 乗算
		time_average = 0;
		for(int i = 0; i < BENCHMARK_TIMES; ++i){
			time_average += (double) benchmarkMul() / BENCHMARK_TIMES;			
		}
		System.out.printf("整数乗算：%f(ms)\n", time_average);

		// 除算
		time_average = 0;
		for(int i = 0; i < BENCHMARK_TIMES; ++i){
			time_average += (double) benchmarkDiv() / BENCHMARK_TIMES;			
		}
		System.out.printf("整数除算：%f(ms)\n", time_average);

		// 浮動小数点加算
		time_average = 0;
		for(int i = 0; i < BENCHMARK_TIMES; ++i){
			time_average += (double) benchmarkFloatAdd() / BENCHMARK_TIMES;			
		}
		System.out.printf("浮動小数点加算：%f(ms)\n", time_average);

		// 浮動小数点減算
		time_average = 0;
		for(int i = 0; i < BENCHMARK_TIMES; ++i){
			time_average += (double) benchmarkFloatSub() / BENCHMARK_TIMES;			
		}
		System.out.printf("浮動小数点減算：%f(ms)\n", time_average);

		// 浮動小数点乗算
		time_average = 0;
		for(int i = 0; i < BENCHMARK_TIMES; ++i){
			time_average += (double) benchmarkFloatMul() / BENCHMARK_TIMES;			
		}
		System.out.printf("浮動小数点乗算：%f(ms)\n", time_average);

		// 浮動小数点除算
		time_average = 0;
		for(int i = 0; i < BENCHMARK_TIMES; ++i){
			time_average += (double) benchmarkFloatDiv() / BENCHMARK_TIMES;			
		}
		System.out.printf("浮動小数点除算：%f(ms)\n", time_average);

	}

	/**
	 * 加算のベンチマーク
	 * @return 計測時間(ms)
	 */
	static long benchmarkAdd(){
		long start_time, end_time;
		long a = 0;
		
		start_time =System.currentTimeMillis();
		for(long i = 0; i < BENCHMARK_SIZE; ++i){
			a += i;
			a = 0;
		}
		end_time =System.currentTimeMillis();
		return (end_time - start_time);
	}

	/**
	 * 減算のベンチマーク
	 * @return 計測時間(ms)
	 */
	static long benchmarkSub(){
		long start_time, end_time;
		long a = 0;
		
		start_time =System.currentTimeMillis();
		for(long i = 0; i < BENCHMARK_SIZE; ++i){
			a -= i;
			a = 0;
		}
		end_time =System.currentTimeMillis();
		return (end_time - start_time);
	}

	/**
	 * 乗算のベンチマーク
	 * @return 計測時間(ms)
	 */
	static long benchmarkMul(){
		long start_time, end_time;
		long a = 1;
		
		start_time =System.currentTimeMillis();
		for(long i = 0; i < BENCHMARK_SIZE; ++i){
			a *= i;
			a = 0;
		}
		end_time =System.currentTimeMillis();
		return (end_time - start_time);
	}
	
	/**
	 * 除算のベンチマーク
	 * @return 計測時間(ms)
	 */
	static long benchmarkDiv(){
		long start_time, end_time;
		long a = 1;
		
		start_time =System.currentTimeMillis();
		for(long i = 1; i < BENCHMARK_SIZE + 1; ++i){ // 0除算を避ける
			a /= i;
			a = 0;
		}
		end_time =System.currentTimeMillis();
		return (end_time - start_time);
	}

	/**
	 * 加算のベンチマーク
	 * @return 計測時間(ms)
	 */
	static long benchmarkFloatAdd(){
		long start_time, end_time;
		double a = 0;
		
		start_time =System.currentTimeMillis();
		for(long i = 0; i < BENCHMARK_SIZE; ++i){
			a += i;
			a = 0.0d;
		}
		end_time =System.currentTimeMillis();
		return (end_time - start_time);
	}

	/**
	 * 減算のベンチマーク
	 * @return 計測時間(ms)
	 */
	static long benchmarkFloatSub(){
		long start_time, end_time;
		float a = 0;
		
		start_time =System.currentTimeMillis();
		for(long i = 0; i < BENCHMARK_SIZE; ++i){
			a -= i;
			a = 0.0f;
		}
		end_time =System.currentTimeMillis();
		return (end_time - start_time);
	}

	/**
	 * 乗算のベンチマーク
	 * @return 計測時間(ms)
	 */
	static long benchmarkFloatMul(){
		long start_time, end_time;
		float a = 1;
		
		start_time =System.currentTimeMillis();
		for(long i = 0; i < BENCHMARK_SIZE; ++i){
			a *= i;
			a = 0.0f;
		}
		end_time =System.currentTimeMillis();
		return (end_time - start_time);
	}
	
	/**
	 * 除算のベンチマーク
	 * @return 計測時間(ms)
	 */
	static long benchmarkFloatDiv(){
		long start_time, end_time;
		float a = 1;
		
		start_time =System.currentTimeMillis();
		for(long i = 1; i < BENCHMARK_SIZE + 1; ++i){ // 0除算を避ける
			a /= i;
			a = 0.0f;
		}
		end_time =System.currentTimeMillis();
		return (end_time - start_time);
	}


}
