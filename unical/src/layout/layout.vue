<template>
  <div>
    <!--    头部-->
    <Head />
    <!--    主体-->
    <div style="display: flex">
      <!--      左侧导航栏-->
      <Menu/>
      <!--      内容区域-->
      <router-view style="flex: 1"/>

    </div>
  </div>
</template>

<script>
import Head from "@/components/Head";
import Menu from "@/components/Menu";

export default {
  name: "layout",
  components: {
    Head,
    Menu
  }
}
</script>

<style scoped>

</style>