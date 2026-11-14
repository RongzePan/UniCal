# UniCal

UniCal is a calendar-based platform designed for students at the University of Liverpool and XJTLU, built as a group project.

This repository preserves an **early-stage (prototype) version** of the project: a Vue 3 + Element Plus single-page application served by Vue CLI, together with a Spring Boot + MyBatis-Plus backend. It contains the login / registration shell, the main layout, the Axios request wrapper, the router and store, and a minimal `User` REST endpoint. The later full-featured Vite-based frontend is maintained separately in the reference repositories listed below.

## Repository Layout

| Path | Description |
| --- | --- |
| `unical/` | Vue 3 frontend (Vue CLI 5, Vue Router 4, Vuex 4, Element Plus, Axios) |
| `springboot/` | Spring Boot 3.2.3 backend (Java 17, MyBatis-Plus, MySQL) |
| `package.json`, `package-lock.json` | Root-level helper dependency (`element-plus`) |

## Quick Start

### Backend

1. Create a local MySQL database named `springboot_Vue` on `localhost:3306` (matching `spring.datasource.url`).
2. Adjust `springboot/src/main/resources/application.properties` to match your local database settings. The committed values are local development defaults; replace the username and password before deploying anywhere.
3. Start the service (listens on port `9090`):

```bash
cd springboot
mvn spring-boot:run
```

### Frontend

```bash
cd unical
npm install
npm run serve
```

`unical/unical.config.js` proxies `/api` requests to `http://localhost:9090` (the dev server exposes the frontend on `http://localhost:8080`). For a production build, run `npm run build`.

> Note: `vue.config.js` is currently minimal; the proxy settings in `unical.config.js` are not loaded automatically by Vue CLI. Apply them in `vue.config.js` if cross-origin requests are required.

## Group Members

- Linyi Tian
- Rongze Pan
- Tianxiao Li
- Yiran Tian
- Yunle Xu
- Zhiyun Xu

## Reference Repositories

- [ZhiyunXu20/Unical](https://github.com/ZhiyunXu20/Unical) — full-featured Vite frontend and project documentation.
- [Tianxiao1201/UniCal](https://github.com/Tianxiao1201/UniCal) — mirror of the Vite frontend under `src/`.

The repository naming, `main` default branch, ignore rules and README structure follow the conventions of the two repositories above. The source code here is the independent Vue CLI + Spring Boot prototype and is not a copy of either reference repository.
