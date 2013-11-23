/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.task.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.TaskStatus;
import com.creditcloud.model.enums.loan.TaskType;
import com.creditcloud.model.enums.user.credit.CertificateType;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 员工的任务
 *
 * @author rooseek
 */
@XmlRootElement
public class Task extends BaseObject {

    private static final long serialVersionUID = 20130917L;

    @NotNull
    private String id;

    /**
     * 任务可以再拆分为多个子任务
     */
    @Column(nullable = true)
    private String parentId;

    /**
     * 任务对应的员工
     */
    @Column(nullable = true)
    private String employeeId;

    /**
     * 任务标题
     */
    @Column(nullable = false)
    private String title;

    /**
     * 任务描述
     */
    @Column(nullable = true)
    private String description;

    /**
     * 任务类型
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskType type;

    /**
     * 任务状态
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus status;

    /**
     * 员工接到任务后开始执行任务开始时间,这个时间可以让
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date timeStarted;

    /**
     * 员工完成任务时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date timeFinished;

    /**
     * 员工的反馈
     */
    @Column(nullable = true)
    private String feedback;

    /**
     * 本次任务需要取证的认证项，员工需要收集这些certificate对应的proof,可以为空
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Collection<CertificateType> certificate;

    /**
     * 该任务的收益，是向用户的收费
     */
    private int taskProfit;

    /**
     * 员工完成该任务后的奖励
     */
    private int employeeProfit;

    private Date timeCreated;

    private Date timeLastUpdated;

    public Task() {
    }

    public Task(String id,
                String parentId,
                String employeeId,
                String title,
                String description,
                TaskType type,
                TaskStatus status,
                Date timeStarted,
                Date timeFinished,
                String feedback,
                Collection<CertificateType> certificate,
                int taskProfit,
                int employeeProfit) {
        this.id = id;
        this.parentId = parentId;
        this.employeeId = employeeId;
        this.title = title;
        this.description = description;
        this.type = type;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.feedback = feedback;
        this.certificate = certificate;
        this.taskProfit = taskProfit;
        this.employeeProfit = employeeProfit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setTimeStarted(Date timeStarted) {
        this.timeStarted = timeStarted;
    }

    public void setTimeFinished(Date timeFinished) {
        this.timeFinished = timeFinished;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setCertificate(Collection<CertificateType> certificate) {
        this.certificate = certificate;
    }

    public String getId() {
        return id;
    }

    public String getParentId() {
        return parentId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getType() {
        return type;
    }

    public TaskStatus getStatus() {
        return status;
    }
    
    public Date getTimeStarted() {
        return timeStarted;
    }

    public Date getTimeFinished() {
        return timeFinished;
    }

    public String getFeedback() {
        return feedback;
    }

    public Collection<CertificateType> getCertificate() {
        return certificate;
    }

    public int getTaskProfit() {
        return taskProfit;
    }

    public int getEmployeeProfit() {
        return employeeProfit;
    }

    public void setTaskProfit(int taskProfit) {
        this.taskProfit = taskProfit;
    }

    public void setEmployeeProfit(int employeeProfit) {
        this.employeeProfit = employeeProfit;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setTimeLastUpdated(Date timeLastUpdated) {
        this.timeLastUpdated = timeLastUpdated;
    }
}