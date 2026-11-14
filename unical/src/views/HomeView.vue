<template>
  <div style="padding:  30px">
<!--    导入导出区-->
    <div style="margin: 10px 0;">
      <el-button type="primary">导入</el-button>
      <el-button type="primary">导出</el-button>

    </div>

<!--    搜索区-->
    <div style="margin: 10px 0;">
      <el-input v-model="search" style="width: 240px" placeholder="Please input" />
      <el-button type="primary" style="margin-left: 5px">Search</el-button>
    </div>
    <el-calendar ref="calendar">
      <template #header="{ date }">
        <span>Custom header content</span>
        <span>{{ date }}</span>
        <el-button-group>
          <el-button size="small" @click="selectDate('prev-year')">
            Previous Year
          </el-button>
          <el-button size="small" @click="selectDate('prev-month')">
            Previous Month
          </el-button>
          <el-button size="small" @click="selectDate('today')">Today</el-button>
          <el-button size="small" @click="selectDate('next-month')">
            Next Month
          </el-button>
          <el-button size="small" @click="selectDate('next-year')">
            Next Year
          </el-button>
        </el-button-group>
      </template>
    </el-calendar>


  </div>
</template>

<script>



export default {
  name: 'HomeView',
  components: {

  }
}
</script>


