
# 🎵 声动心弦 - 校园音乐分享平台的数字交响

> 用代码谱写旋律，让每一次点击都回响心弦。一个基于 Java 的校园音乐分享与播放平台，现已加入自动化测试与构建打包支持！

---

## 🌟 项目简介

“声动心弦” 是一款专为校园环境设计的数字音乐分享平台，后端基于 Spring Boot 构建，支持音乐上传、在线播放、搜索等功能。该平台旨在营造一个自由、个性、温暖的音乐互动空间。

> 🔄 **NEW:** 当前版本已引入自动化测试和打包流程，为持续集成与交付打下基础！

---

## 🛠️ 技术栈

| 模块       | 技术选型                         |
|------------|----------------------------------|
| 后端框架   | Spring Boot                      |
| ORM        | MyBatis + MySQL                  |
| 前端展示   | HTML / CSS / Thymeleaf           |
| 播放支持   | HTML5 `<audio>` 标签             |
| 文件管理   | Multipart 文件上传 + 本地存储     |
| 测试框架   | JUnit5 + SpringBootTest          |
| 构建工具   | Maven / Spring Boot Maven Plugin |

---

## 🚀 核心功能

- 🎶 音乐上传与管理：支持多格式音频上传
- ▶️ 音乐在线播放：点击即播，流畅无卡顿
- 🔍 搜索功能支持：模糊匹配歌曲名、歌手
- 🧪 自动化测试支持：业务逻辑覆盖全面
- 📦 一键打包构建：Maven 管理，便于部署

---

## 🔗 在线体验

- 登录页面：👉 [http://60.205.7.136:8080/login.html](http://60.205.7.136:8080/login.html)

---

## 📦 快速启动

### 1. 克隆项目

```bash
git clone https://github.com/your-username/melody-share.git
cd melody-share
````

### 2. 配置数据库连接

编辑 `src/main/resources/application.yml`：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/music_db
    username: root
    password: yourpassword
```

### 3. 运行测试用例

```bash
mvn test
```

### 4. 打包构建项目

```bash
mvn clean package
```

成功后会生成 `target/melody-share-xxx.jar`，运行：

```bash
java -jar target/melody-share-xxx.jar
```

---

## ✅ 自动化测试亮点

* 使用 **SpringBootTest + JUnit5** 编写了服务层和控制层的测试用例
* 涵盖：

  * 上传与文件验证
  * 播放列表接口逻辑
  * 数据库交互验证
* 命令行一键运行，持续测试支持良好

---

## 📂 项目结构概览

```text
├── controller       # 控制层
├── service          # 业务逻辑
├── mapper           # 数据访问
├── entity           # 实体类
├── test             # 自动化测试
├── resources
│   ├── templates    # 前端页面
│   └── static       # 静态资源
├── music-files      # 音频文件存储
└── application.yml
```

---

## 📖 灵感与愿景

这个项目源于一个朴素的愿望——让校园里的音乐爱好者拥有一个温暖的线上交流平台。如今，它不仅是一段旋律的数字旅程，也是一段软件工程的成长旅程。

---

## 📬 联系与交流

如有建议或合作意向，欢迎提交 [Issues](https://github.com/your-username/melody-share/issues) 或通过 GitHub 与我联系！

---

> “代码是骨架，音乐是灵魂。愿这个项目像旋律一样，连接更多人的心弦。”

```


