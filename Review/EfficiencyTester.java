public abstract class EfficiencyTester {

	public final void getEfficiency() {
		long beginTime = System.currentTimeMillis();
		this.work();
		long endTime = System.currentTimeMillis();
		System.out.println("耗时：" + (endTime - beginTime) + "毫秒");
	}

	public abstract void work();

}