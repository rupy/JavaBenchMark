package javaBenchMark;

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
		double time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkAdd();
		}
		System.out.printf("整数加算：%f(s)\n", time_sum / BENCHMARK_TIMES);

		// 減算
		time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkSub();
		}
		System.out.printf("整数減算：%f(s)\n", time_sum / BENCHMARK_TIMES);

		// 乗算
		time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkMul();
		}
		System.out.printf("整数乗算：%f(s)\n", time_sum / BENCHMARK_TIMES);

		// 除算
		time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkDiv();
		}
		System.out.printf("整数除算：%f(s)\n", time_sum / BENCHMARK_TIMES);

		// 浮動小数点加算
		time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkFloatAdd();
		}
		System.out.printf("実数加算：%f(s)\n", time_sum / BENCHMARK_TIMES);

		// 浮動小数点減算
		time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkFloatSub();
		}
		System.out.printf("実数減算：%f(s)\n", time_sum / BENCHMARK_TIMES);

		// 浮動小数点乗算
		time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkFloatMul();
		}
		System.out.printf("実数乗算：%f(s)\n", time_sum / BENCHMARK_TIMES);

		// 浮動小数点除算
		time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkFloatDiv();
		}
		System.out.printf("実数除算：%f(s)\n", time_sum / BENCHMARK_TIMES);

		// 関数呼び出し
		time_sum = 0;
		for (int i = 0; i < BENCHMARK_TIMES; ++i) {
			time_sum += benchmarkCallFunc();
		}
		System.out.printf("関数呼出：%f(s)\n", time_sum / BENCHMARK_TIMES);

	}

	/**
	 * 加算のベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkAdd() {
		long start_time, end_time;
		long a = 0;

		start_time = System.currentTimeMillis();
		for (long i = 0; i < BENCHMARK_SIZE; ++i) {
			a += i;
			a = 0;
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 減算のベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkSub() {
		long start_time, end_time;
		long a = 0;

		start_time = System.currentTimeMillis();
		for (long i = 0; i < BENCHMARK_SIZE; ++i) {
			a -= i;
			a = 0;
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 乗算のベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkMul() {
		long start_time, end_time;
		long a = 1;

		start_time = System.currentTimeMillis();
		for (long i = 0; i < BENCHMARK_SIZE; ++i) {
			a *= i;
			a = 0;
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 除算のベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkDiv() {
		long start_time, end_time;
		long a = 1;

		start_time = System.currentTimeMillis();
		for (long i = 1; i < BENCHMARK_SIZE + 1; ++i) { // 0除算を避ける
			a /= i;
			a = 0;
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 加算のベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkFloatAdd() {
		long start_time, end_time;
		double a = 0;

		start_time = System.currentTimeMillis();
		for (long i = 0; i < BENCHMARK_SIZE; ++i) {
			a += i;
			a = 0.0d;
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 減算のベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkFloatSub() {
		long start_time, end_time;
		float a = 0;

		start_time = System.currentTimeMillis();
		for (long i = 0; i < BENCHMARK_SIZE; ++i) {
			a -= i;
			a = 0.0f;
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 乗算のベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkFloatMul() {
		long start_time, end_time;
		float a = 1;

		start_time = System.currentTimeMillis();
		for (long i = 0; i < BENCHMARK_SIZE; ++i) {
			a *= i;
			a = 0.0f;
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 除算のベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkFloatDiv() {
		long start_time, end_time;
		float a = 1;

		start_time = System.currentTimeMillis();
		for (long i = 1; i < BENCHMARK_SIZE + 1; ++i) { // 0除算を避ける
			a /= i;
			a = 0.0f;
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 関数呼び出しのベンチマーク
	 * 
	 * @return 計測時間(ms)
	 */
	static double benchmarkCallFunc() {
		long start_time, end_time;
		float a = 1;

		start_time = System.currentTimeMillis();
		for (long i = 1; i < BENCHMARK_SIZE + 1; ++i) { // 0除算を避ける
			emptyFunc();
		}
		end_time = System.currentTimeMillis();
		return (end_time - start_time) / 1000.0;
	}

	/**
	 * 空の関数
	 * 
	 * @return 1
	 */
	static int emptyFunc() {
		return 10;
	}

}
