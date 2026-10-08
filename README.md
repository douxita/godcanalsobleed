# godcanalsobleed

我的 Java 练习仓库。

## 内容

### 智能家居控制系统（控制台版）

跟着黑马程序员 JavaSE 课程做的接口 / 多态练习。

**功能**：4 个设备（电视、空调、洗衣机、吊灯）都能「按一下开关」，
在控制台里输入编号控制对应设备的开 / 关。

**用到的 Java 知识点**
- **接口 + 多态**：`Switch` 接口定义"能被开关"这个能力，
  `JD[]` 数组里存不同子类，调用时自动走到各自的实现
- **单例**：`SmartHomeController.getInstance()` 全局只有一个控制器
- **Scanner**：读取键盘输入

**怎么跑**：运行 `src/com/itheima/demo/Test.java` 的 `main` 方法

## 目录结构

```
src/com/itheima/demo/
├── Switch.java                         开关接口
├── JD.java                             家电基类（实现 Switch）
├── TV.java / Air.java                  电视 / 空调
├── WashMachine.java / Lamp.java        洗衣机 / 吊灯
├── SmartHomeController.java            单例控制器
└── Test.java                           程序入口
```
