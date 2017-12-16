package ganjidemo;
/**
 * 
 * @author thinkpad
 * 职位招聘模型
 */
public class jobModel {

	//岗位
	private String jobName;
	//薪资
	private float salary;
	//公司名
	private String compName;
	public jobModel(String jobName, float salary, String compName) {
		super();
		this.jobName = jobName;
		this.salary = salary;
		this.compName = compName;
	}
	public jobModel() {
		super();
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	@Override
	public String toString() {
		return "職位是:" + jobName + ", 薪資是:" + salary + ", 公司名稱是:" + compName + "]";
	}

}
