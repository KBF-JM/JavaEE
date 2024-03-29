package org.kbf.jmshome.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadrecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("fileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("fileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("fileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("fileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("fileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("fileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("fileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("fileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("fileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("fileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("fileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("fileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("fileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("fileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFileidIsNull() {
            addCriterion("fileId is null");
            return (Criteria) this;
        }

        public Criteria andFileidIsNotNull() {
            addCriterion("fileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileidEqualTo(String value) {
            addCriterion("fileId =", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotEqualTo(String value) {
            addCriterion("fileId <>", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThan(String value) {
            addCriterion("fileId >", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThanOrEqualTo(String value) {
            addCriterion("fileId >=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThan(String value) {
            addCriterion("fileId <", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThanOrEqualTo(String value) {
            addCriterion("fileId <=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLike(String value) {
            addCriterion("fileId like", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotLike(String value) {
            addCriterion("fileId not like", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidIn(List<String> values) {
            addCriterion("fileId in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotIn(List<String> values) {
            addCriterion("fileId not in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidBetween(String value1, String value2) {
            addCriterion("fileId between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotBetween(String value1, String value2) {
            addCriterion("fileId not between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andUploadpathIsNull() {
            addCriterion("uploadPath is null");
            return (Criteria) this;
        }

        public Criteria andUploadpathIsNotNull() {
            addCriterion("uploadPath is not null");
            return (Criteria) this;
        }

        public Criteria andUploadpathEqualTo(String value) {
            addCriterion("uploadPath =", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotEqualTo(String value) {
            addCriterion("uploadPath <>", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathGreaterThan(String value) {
            addCriterion("uploadPath >", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathGreaterThanOrEqualTo(String value) {
            addCriterion("uploadPath >=", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLessThan(String value) {
            addCriterion("uploadPath <", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLessThanOrEqualTo(String value) {
            addCriterion("uploadPath <=", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLike(String value) {
            addCriterion("uploadPath like", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotLike(String value) {
            addCriterion("uploadPath not like", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathIn(List<String> values) {
            addCriterion("uploadPath in", values, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotIn(List<String> values) {
            addCriterion("uploadPath not in", values, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathBetween(String value1, String value2) {
            addCriterion("uploadPath between", value1, value2, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotBetween(String value1, String value2) {
            addCriterion("uploadPath not between", value1, value2, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("fileType is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("fileType is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(Integer value) {
            addCriterion("fileType =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(Integer value) {
            addCriterion("fileType <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(Integer value) {
            addCriterion("fileType >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileType >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(Integer value) {
            addCriterion("fileType <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(Integer value) {
            addCriterion("fileType <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<Integer> values) {
            addCriterion("fileType in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<Integer> values) {
            addCriterion("fileType not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(Integer value1, Integer value2) {
            addCriterion("fileType between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fileType not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andUploaduseridIsNull() {
            addCriterion("uploadUserId is null");
            return (Criteria) this;
        }

        public Criteria andUploaduseridIsNotNull() {
            addCriterion("uploadUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUploaduseridEqualTo(String value) {
            addCriterion("uploadUserId =", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridNotEqualTo(String value) {
            addCriterion("uploadUserId <>", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridGreaterThan(String value) {
            addCriterion("uploadUserId >", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridGreaterThanOrEqualTo(String value) {
            addCriterion("uploadUserId >=", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridLessThan(String value) {
            addCriterion("uploadUserId <", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridLessThanOrEqualTo(String value) {
            addCriterion("uploadUserId <=", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridLike(String value) {
            addCriterion("uploadUserId like", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridNotLike(String value) {
            addCriterion("uploadUserId not like", value, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridIn(List<String> values) {
            addCriterion("uploadUserId in", values, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridNotIn(List<String> values) {
            addCriterion("uploadUserId not in", values, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridBetween(String value1, String value2) {
            addCriterion("uploadUserId between", value1, value2, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploaduseridNotBetween(String value1, String value2) {
            addCriterion("uploadUserId not between", value1, value2, "uploaduserid");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andCheckstatuIsNull() {
            addCriterion("checkStatu is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatuIsNotNull() {
            addCriterion("checkStatu is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatuEqualTo(Integer value) {
            addCriterion("checkStatu =", value, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuNotEqualTo(Integer value) {
            addCriterion("checkStatu <>", value, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuGreaterThan(Integer value) {
            addCriterion("checkStatu >", value, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkStatu >=", value, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuLessThan(Integer value) {
            addCriterion("checkStatu <", value, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuLessThanOrEqualTo(Integer value) {
            addCriterion("checkStatu <=", value, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuIn(List<Integer> values) {
            addCriterion("checkStatu in", values, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuNotIn(List<Integer> values) {
            addCriterion("checkStatu not in", values, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuBetween(Integer value1, Integer value2) {
            addCriterion("checkStatu between", value1, value2, "checkstatu");
            return (Criteria) this;
        }

        public Criteria andCheckstatuNotBetween(Integer value1, Integer value2) {
            addCriterion("checkStatu not between", value1, value2, "checkstatu");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}