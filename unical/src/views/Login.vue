<template>
  <div style="width: 100%; height: 100vh; background-color: darkslateblue; overflow: hidden">
    <div style="width: 400px; margin: 100px auto">
      <div style="color: #cccccc; font-size: 30px; text-align: center; padding: 30px 0">登录窗口</div>
      <el-form ref="form" :model="form" size="normal">
        <el-form-item>
          <el-input :suffix-icon="Calendar" v-model="form.username" placeholder="用户名"></el-input>
        </el-form-item>
        <el-form-item>
          <el-input v-model="form.password" :type="passwordType" placeholder="密码" show-password >
            <template slot="suffix">
              <i :class="{'el-icon-view': passwordType === 'password', 'el-icon-view-off': passwordType !== 'password'}" @click="togglePassword"></i>
            </template>
          </el-input>
        </el-form-item>
        <el-form-item>
          <el-button style="width: 100%" type="primary" @click="login">登录</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
// import request from "@/utils/request";

import {request} from "axios";
//import request from "@/utils/request";

export default {
  name: "Login",
  data() {
    return {
      form: {}
    };
  },
  methods: {
    login() {
      request.post("/api/user/login", this.form).then(res => {
        if (res.code === '0') {
          this.$message({
            type: "success",
            message: "登录成功"
          });
          this.$router.push("/")//登录成功进行跳转
        } else {
          this.$message({
            type: "error",
            message: res.msg
          });
        }
      });
    }
  }
};
</script>

<style scoped>
</style>
