#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/init.h>

static int __init hello_init(void)
{
    printk(KERN_INFO "Hello, QEMU ARM64! Custom Kernel Module Loaded.\n");
    return 0;
}

static void __exit hello_exit(void)
{
    printk(KERN_INFO "Goodbye, QEMU ARM64! Custom Kernel Module Unloaded.\n");
}

module_init(hello_init);
module_exit(hello_exit);

MODULE_LICENSE("GPL");
MODULE_AUTHOR("Antigravity");
MODULE_DESCRIPTION("A simple Hello World Kernel Module for qemuarm64");
