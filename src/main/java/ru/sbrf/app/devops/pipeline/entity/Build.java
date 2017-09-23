package ru.sbrf.app.devops.pipeline.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Класс описывающий сборку
 * Created by Kuzmin on 23.09.2017.
 */
@Entity
public class Build implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * group_id в Nexus
     */
    private String groupId;

    /**
     * artifact_id в Nexus
     */
    private String artifactId;

    /**
     * version в Nexus
     */
    private String version;

    /**
     * Дата изменения состояния
     */
    private Date modifyDate;

    /**
     * Состояние сборки
     */
    private State state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Build build = (Build) o;

        if (groupId != null ? !groupId.equals(build.groupId) : build.groupId != null) return false;
        if (artifactId != null ? !artifactId.equals(build.artifactId) : build.artifactId != null) return false;
        return version != null ? version.equals(build.version) : build.version == null;
    }

    @Override
    public int hashCode() {
        int result = groupId != null ? groupId.hashCode() : 0;
        result = 31 * result + (artifactId != null ? artifactId.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }

}
