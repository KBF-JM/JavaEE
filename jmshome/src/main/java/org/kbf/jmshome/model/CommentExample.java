package org.kbf.jmshome.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentbodyIsNull() {
            addCriterion("commentBody is null");
            return (Criteria) this;
        }

        public Criteria andCommentbodyIsNotNull() {
            addCriterion("commentBody is not null");
            return (Criteria) this;
        }

        public Criteria andCommentbodyEqualTo(String value) {
            addCriterion("commentBody =", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotEqualTo(String value) {
            addCriterion("commentBody <>", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyGreaterThan(String value) {
            addCriterion("commentBody >", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyGreaterThanOrEqualTo(String value) {
            addCriterion("commentBody >=", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLessThan(String value) {
            addCriterion("commentBody <", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLessThanOrEqualTo(String value) {
            addCriterion("commentBody <=", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyLike(String value) {
            addCriterion("commentBody like", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotLike(String value) {
            addCriterion("commentBody not like", value, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyIn(List<String> values) {
            addCriterion("commentBody in", values, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotIn(List<String> values) {
            addCriterion("commentBody not in", values, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyBetween(String value1, String value2) {
            addCriterion("commentBody between", value1, value2, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommentbodyNotBetween(String value1, String value2) {
            addCriterion("commentBody not between", value1, value2, "commentbody");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("commentTime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("commentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterion("commentTime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterion("commentTime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterion("commentTime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commentTime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterion("commentTime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("commentTime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterion("commentTime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterion("commentTime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterion("commentTime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("commentTime not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andStoryidIsNull() {
            addCriterion("storyId is null");
            return (Criteria) this;
        }

        public Criteria andStoryidIsNotNull() {
            addCriterion("storyId is not null");
            return (Criteria) this;
        }

        public Criteria andStoryidEqualTo(String value) {
            addCriterion("storyId =", value, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidNotEqualTo(String value) {
            addCriterion("storyId <>", value, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidGreaterThan(String value) {
            addCriterion("storyId >", value, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidGreaterThanOrEqualTo(String value) {
            addCriterion("storyId >=", value, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidLessThan(String value) {
            addCriterion("storyId <", value, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidLessThanOrEqualTo(String value) {
            addCriterion("storyId <=", value, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidLike(String value) {
            addCriterion("storyId like", value, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidNotLike(String value) {
            addCriterion("storyId not like", value, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidIn(List<String> values) {
            addCriterion("storyId in", values, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidNotIn(List<String> values) {
            addCriterion("storyId not in", values, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidBetween(String value1, String value2) {
            addCriterion("storyId between", value1, value2, "storyid");
            return (Criteria) this;
        }

        public Criteria andStoryidNotBetween(String value1, String value2) {
            addCriterion("storyId not between", value1, value2, "storyid");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNull() {
            addCriterion("commentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(String value) {
            addCriterion("commentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(String value) {
            addCriterion("commentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(String value) {
            addCriterion("commentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(String value) {
            addCriterion("commentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(String value) {
            addCriterion("commentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(String value) {
            addCriterion("commentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLike(String value) {
            addCriterion("commentId like", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotLike(String value) {
            addCriterion("commentId not like", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<String> values) {
            addCriterion("commentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<String> values) {
            addCriterion("commentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(String value1, String value2) {
            addCriterion("commentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(String value1, String value2) {
            addCriterion("commentId not between", value1, value2, "commentid");
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