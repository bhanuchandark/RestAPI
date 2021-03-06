package spring.ladybug.ladybugapp.pojos;
// Generated 19 Jan, 2020 1:05:57 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * BugDtls generated by hbm2java
 */
@Entity
@Table(name = "bug_dtls", catalog = "ladybug_app_main")
 @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
/*
 * @JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class,
 * property = "bugId")
 */
public class BugDtls implements java.io.Serializable {

	private Integer bugId;
	private Employee emp;
	private Project project;
	private String bugName;
	private String bugDesc;
	private LocalDate bugStart;
	private LocalDate bugEnd;
	private String bugPriority;
	private Integer bugAssignee;
	private String bugStatus;
	private Integer bugMgrId;

	public BugDtls() {
	}

	public BugDtls(Employee emp, String bugName, String bugDesc) {
		this.emp = emp;
		this.bugName = bugName;
		this.bugDesc = bugDesc;
	}

	public BugDtls(Employee emp, Project project, String bugName, String bugDesc, LocalDate bugStart, LocalDate bugEnd,
			String bugPriority, Integer bugAssignee, String bugStatus, Integer bugMgrId) {
		this.emp = emp;
		this.project = project;
		this.bugName = bugName;
		this.bugDesc = bugDesc;
		this.bugStart = bugStart;
		this.bugEnd = bugEnd;
		this.bugPriority = bugPriority;
		this.bugAssignee = bugAssignee;
		this.bugStatus = bugStatus;
		this.bugMgrId = bugMgrId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "bug_id", unique = true, nullable = false)
	public Integer getBugId() {
		return this.bugId;
	}

	public void setBugId(Integer bugId) {
		this.bugId = bugId;
	}

	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bug_by_emp_id", nullable = false)
	public Employee getEmp() {
		return this.emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bug_project_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "bug_name", nullable = false, length = 45)
	public String getBugName() {
		return this.bugName;
	}

	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	@Column(name = "bug_desc", nullable = false, length = 250)
	public String getBugDesc() {
		return this.bugDesc;
	}

	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}

	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bug_start", length = 19)
	public LocalDate getBugStart() {
		return this.bugStart;
	}

	public void setBugStart(LocalDate bugStart) {
		this.bugStart = bugStart;
	}

	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bug_end", length = 19)
	public LocalDate getBugEnd() {
		return this.bugEnd;
	}

	public void setBugEnd(LocalDate bugEnd) {
		this.bugEnd = bugEnd;
	}

	@Column(name = "bug_priority", length = 45)
	public String getBugPriority() {
		return this.bugPriority;
	}

	public void setBugPriority(String bugPriority) {
		this.bugPriority = bugPriority;
	}

	@Column(name = "bug_assignee", length = 45)
	public Integer getBugAssignee() {
		return this.bugAssignee;
	}

	public void setBugAssignee(Integer bugAssignee) {
		this.bugAssignee = bugAssignee;
	}

	@Column(name = "bug_status", length = 45)
	public String getBugStatus() {
		return this.bugStatus;
	}

	public void setBugStatus(String bugStatus) {
		this.bugStatus = bugStatus;
	}

	@Column(name = "bug_mgr_id", length = 45)
	public Integer getBugMgrId() {
		return this.bugMgrId;
	}

	public void setBugMgrId(Integer bugMgrId) {
		this.bugMgrId = bugMgrId;
	}

}
