package com.water.entity;

import java.util.ArrayList;
import java.util.List;

public class SpecsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecsExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWaterIdIsNull() {
            addCriterion("water_id is null");
            return (Criteria) this;
        }

        public Criteria andWaterIdIsNotNull() {
            addCriterion("water_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaterIdEqualTo(Integer value) {
            addCriterion("water_id =", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotEqualTo(Integer value) {
            addCriterion("water_id <>", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdGreaterThan(Integer value) {
            addCriterion("water_id >", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_id >=", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdLessThan(Integer value) {
            addCriterion("water_id <", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("water_id <=", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdIn(List<Integer> values) {
            addCriterion("water_id in", values, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotIn(List<Integer> values) {
            addCriterion("water_id not in", values, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdBetween(Integer value1, Integer value2) {
            addCriterion("water_id between", value1, value2, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("water_id not between", value1, value2, "waterId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdIsNull() {
            addCriterion("guige_id is null");
            return (Criteria) this;
        }

        public Criteria andGuigeIdIsNotNull() {
            addCriterion("guige_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuigeIdEqualTo(Integer value) {
            addCriterion("guige_id =", value, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdNotEqualTo(Integer value) {
            addCriterion("guige_id <>", value, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdGreaterThan(Integer value) {
            addCriterion("guige_id >", value, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guige_id >=", value, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdLessThan(Integer value) {
            addCriterion("guige_id <", value, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdLessThanOrEqualTo(Integer value) {
            addCriterion("guige_id <=", value, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdIn(List<Integer> values) {
            addCriterion("guige_id in", values, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdNotIn(List<Integer> values) {
            addCriterion("guige_id not in", values, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdBetween(Integer value1, Integer value2) {
            addCriterion("guige_id between", value1, value2, "guigeId");
            return (Criteria) this;
        }

        public Criteria andGuigeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guige_id not between", value1, value2, "guigeId");
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