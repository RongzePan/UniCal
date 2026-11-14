import { createRouter, createWebHistory } from 'vue-router'
import layout from '../layout/layout.vue'

const routes = [
  {
    path: '/',
    name: 'layout',
    component: layout,
    redirect:"/home",
    children: [
      {
        path: 'home',
        name: 'HomeView',
        component: () => import ("@/views/HomeView"),
      }

    ]
  },
  {
    path: '/Login',
    name: 'Login',
    component: () => import( "@/views/Login")
  },

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
