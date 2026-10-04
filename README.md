# InterestingBooks

图书管理 REST API，包含后端和前端。

## 做了什么

- 后端：Spring Boot + PostgreSQL，提供图书的增删改查接口
- 前端：Vue 3 + Vite，提供用户操作界面
- 用 Docker Compose 运行 PostgreSQL
- 用 Swagger 自动生成 API 文档

## 我负责

全部（从需求拆解到编码、测试、部署）

## 用了哪些工具

- Java 17、Spring Boot 4.0.5
- Spring Data JPA、PostgreSQL
- Docker Compose
- Swagger (springdoc-openapi)
- Vue 3 + Vite
- Gradle
- AI 辅助开发（ChatGPT/Codex）

## 收获

- 学会了分层架构（Controller / Service / Repository）
- 学会了错误处理（400 / 404 / 409 / 500）
- 学会了参数校验（@Valid + @NotBlank）
- 踩过 Postgres 18 挂载路径的坑
- 修过 setId(null) 的边界情况

## API 接口

| 方法 | 路径 | 说明 |
|---|---|---|
| GET | /API/V1/books | 查所有书 |
| GET | /API/V1/books/{id} | 按 ID 查书 |
| POST | /API/V1/books | 新增书 |
| PUT | /API/V1/books/{id} | 更新书 |
| DELETE | /API/V1/books/{id} | 删除书 |

## 本地运行

### 1. 启动数据库

```bash
docker compose up -d