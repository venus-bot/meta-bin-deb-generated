PACKAGES = "${PN} fdisk libblkid-dev libblkid1 libfdisk1 libmount-dev libmount1 libsmartcols1 libuuid1 mount util-linux uuid-dev"
PROVIDES = "fdisk libblkid-dev libblkid1 libfdisk1 libmount-dev libmount1 libsmartcols1 libuuid1 mount util-linux uuid-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/fdisk_2.33.1-0.1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libblkid-dev_2.33.1-0.1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libblkid1_2.33.1-0.1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libfdisk1_2.33.1-0.1_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libmount-dev_2.33.1-0.1_armhf.deb;unpack=0;name=deb4\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libmount1_2.33.1-0.1_armhf.deb;unpack=0;name=deb5\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libsmartcols1_2.33.1-0.1_armhf.deb;unpack=0;name=deb6\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libuuid1_2.33.1-0.1_armhf.deb;unpack=0;name=deb7\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/mount_2.33.1-0.1_armhf.deb;unpack=0;name=deb8\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/util-linux_2.33.1-0.1_armhf.deb;unpack=0;name=deb9\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/uuid-dev_2.33.1-0.1_armhf.deb;unpack=0;name=deb10\
"
DEBFILENAME_fdisk = "fdisk_2.33.1-0.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "b6b25b074c96cecea4591cea34a4ec8386f84b4839c062614b7a2b6860852f8d"
SRC_URI[deb0.md5sum] = "b17c1f6d551f78deec1fb5115e2154b4"
DEBFILENAME_libblkid-dev = "libblkid-dev_2.33.1-0.1_armhf.deb"
SRC_URI[deb1.sha256sum] = "1274ba8a74c2144ddd3d6124cc81d1bffad228af6a5553e7e85dc72d515bc46f"
SRC_URI[deb1.md5sum] = "edc423083d186e946c28bdc312a3c83a"
DEBFILENAME_libblkid1 = "libblkid1_2.33.1-0.1_armhf.deb"
SRC_URI[deb2.sha256sum] = "92801e35c3dbe24f2cb45d76e0837bc3928ecf2c1016ab07e827097634afa2c0"
SRC_URI[deb2.md5sum] = "f5e4df75a2cb76c8ed668c389fcb6753"
DEBFILENAME_libfdisk1 = "libfdisk1_2.33.1-0.1_armhf.deb"
SRC_URI[deb3.sha256sum] = "3f6b0cf5c617b6a01d29d886da13c6b01089358a189defc4e3e77e8c2d5c3b82"
SRC_URI[deb3.md5sum] = "ba7a71096391cec6043effa7e961d4b4"
DEBFILENAME_libmount-dev = "libmount-dev_2.33.1-0.1_armhf.deb"
SRC_URI[deb4.sha256sum] = "24c59b7b33df451c7c3eca4b1d39a25c2e26eca4d4ee6b47331382175307dc11"
SRC_URI[deb4.md5sum] = "acdf0ab2fab5bbeb9ef6eb760441173b"
DEBFILENAME_libmount1 = "libmount1_2.33.1-0.1_armhf.deb"
SRC_URI[deb5.sha256sum] = "9443056463d7ddedde9bf28e1f2b6486198b68143fa0b7a2688e3edf823d566d"
SRC_URI[deb5.md5sum] = "9049a84f7d2c01c14770134c0484630a"
DEBFILENAME_libsmartcols1 = "libsmartcols1_2.33.1-0.1_armhf.deb"
SRC_URI[deb6.sha256sum] = "89b68e6864243156a40e4b0f48a2f8be7d8839d10c57faabe118dd6b73ea72ac"
SRC_URI[deb6.md5sum] = "26bdf3dfd66639ed2a6ecb649492d2ee"
DEBFILENAME_libuuid1 = "libuuid1_2.33.1-0.1_armhf.deb"
SRC_URI[deb7.sha256sum] = "31dd55f3044d29370d22f956aa86965b085a201f133771aed5a44631bf989791"
SRC_URI[deb7.md5sum] = "100863dbcba430852d98b87500ab27e9"
DEBFILENAME_mount = "mount_2.33.1-0.1_armhf.deb"
SRC_URI[deb8.sha256sum] = "783415bffef39bf23b3f7951c1aa2f341dfa2ed39d8277373bbb0d94055b3fc7"
SRC_URI[deb8.md5sum] = "4b4c9022c895e151e9685a45f38e46f5"
DEBFILENAME_util-linux = "util-linux_2.33.1-0.1_armhf.deb"
SRC_URI[deb9.sha256sum] = "cb49e05926af8592fb42b2b02b8a8c5b7a6933449b7445a88aa310b041b28e06"
SRC_URI[deb9.md5sum] = "927b24588912778ece22ff74f86cd87c"
DEBFILENAME_uuid-dev = "uuid-dev_2.33.1-0.1_armhf.deb"
SRC_URI[deb10.sha256sum] = "76bd2830e577411840c79cf28560eb8041ddafc1f157d2cb9bde71ed1fbfbb33"
SRC_URI[deb10.md5sum] = "4277ba83d6e939592749df3931378ffa"

RDEPENDS_fdisk = "libc6 (>= 2.28) libfdisk1 (>= 2.33) libmount1 (>= 2.24.2) libncursesw6 (>= 6) libsmartcols1 (>= 2.28~rc1) libtinfo6 (>= 6)"
RDEPENDS_libblkid-dev = "libblkid1 (= 2.33.1-0.1) libc6-dev uuid-dev"
RDEPENDS_libblkid1 = "libc6 (>= 2.28) libuuid1 (>= 2.16)"
RDEPENDS_libfdisk1 = "libblkid1 (>= 2.24.2) libc6 (>= 2.28) libuuid1 (>= 2.16)"
RDEPENDS_libmount-dev = "libblkid-dev libc6-dev libmount1 (= 2.33.1-0.1)"
RDEPENDS_libmount1 = "libblkid1 (>= 2.17.2) libc6 (>= 2.28) libselinux1 (>= 2.6-3~)"
RDEPENDS_libsmartcols1 = "libc6 (>= 2.28)"
RDEPENDS_libuuid1 = "libc6 (>= 2.28)"
RDEPENDS_mount = "libblkid1 (>= 2.17.2) libc6 (>= 2.28) libmount1 (>= 2.33) libselinux1 (>= 2.6-3~) libsmartcols1 (>= 2.33) util-linux (>= 2.29.2-3~)"
RDEPENDS_${PN} = "fdisk libaudit1 (>= 1:2.2.1) libblkid1 (>= 2.31.1) libc6 (>= 2.28) libcap-ng0 (>= 0.7.9) libmount1 (>= 2.25) libpam0g (>= 0.99.7.1) libselinux1 (>= 2.6-3~) libsmartcols1 (>= 2.33) libsystemd0 libtinfo6 (>= 6) libudev1 (>= 183) libuuid1 (>= 2.16) login (>= 1:4.5-1.1~) zlib1g (>= 1:1.1.4)"
RDEPENDS_uuid-dev = "libc6-dev libuuid1 (= 2.33.1-0.1)"
DEPENDS = "libaudit1 libc6 libc6-dev libcap-ng0 libncursesw6 libpam0g libselinux1 libsystemd0 libtinfo6 libudev1 login zlib1g"


inherit deb_group

FILES_fdisk = " \
    ./sbin/cfdisk \
    ./sbin/fdisk \
    ./sbin/sfdisk \
    ./usr/share/bash-completion/completions/cfdisk \
    ./usr/share/bash-completion/completions/fdisk \
    ./usr/share/bash-completion/completions/sfdisk \
    ./usr/share/doc/fdisk/changelog.Debian.gz \
    ./usr/share/doc/fdisk/changelog.gz \
    ./usr/share/doc/fdisk/copyright \
    ./usr/share/man/man8/cfdisk.8.gz \
    ./usr/share/man/man8/fdisk.8.gz \
    ./usr/share/man/man8/sfdisk.8.gz\
"
FILES_libblkid-dev = " \
    ./usr/include/blkid/blkid.h \
    ./usr/lib/arm-linux-gnueabihf/libblkid.a \
    ./usr/lib/arm-linux-gnueabihf/libblkid.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/blkid.pc \
    ./usr/share/doc/libblkid-dev/changelog.Debian.gz \
    ./usr/share/doc/libblkid-dev/changelog.gz \
    ./usr/share/doc/libblkid-dev/copyright \
    ./usr/share/man/man3/libblkid.3.gz\
"
FILES_libblkid1 = " \
    ./lib/arm-linux-gnueabihf/libblkid.so.1 \
    ./lib/arm-linux-gnueabihf/libblkid.so.1.1.0 \
    ./usr/share/doc/libblkid1/changelog.Debian.gz \
    ./usr/share/doc/libblkid1/changelog.gz \
    ./usr/share/doc/libblkid1/copyright\
"
FILES_libfdisk1 = " \
    ./lib/arm-linux-gnueabihf/libfdisk.so.1 \
    ./lib/arm-linux-gnueabihf/libfdisk.so.1.1.0 \
    ./usr/share/doc/libfdisk1/changelog.Debian.gz \
    ./usr/share/doc/libfdisk1/changelog.gz \
    ./usr/share/doc/libfdisk1/copyright\
"
FILES_libmount-dev = " \
    ./usr/include/libmount/libmount.h \
    ./usr/lib/arm-linux-gnueabihf/libmount.a \
    ./usr/lib/arm-linux-gnueabihf/libmount.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/mount.pc \
    ./usr/share/doc/libmount-dev/changelog.Debian.gz \
    ./usr/share/doc/libmount-dev/changelog.gz \
    ./usr/share/doc/libmount-dev/copyright\
"
FILES_libmount1 = " \
    ./lib/arm-linux-gnueabihf/libmount.so.1 \
    ./lib/arm-linux-gnueabihf/libmount.so.1.1.0 \
    ./usr/share/doc/libmount1/changelog.Debian.gz \
    ./usr/share/doc/libmount1/changelog.gz \
    ./usr/share/doc/libmount1/copyright\
"
FILES_libsmartcols1 = " \
    ./lib/arm-linux-gnueabihf/libsmartcols.so.1 \
    ./lib/arm-linux-gnueabihf/libsmartcols.so.1.1.0 \
    ./usr/share/doc/libsmartcols1/changelog.Debian.gz \
    ./usr/share/doc/libsmartcols1/changelog.gz \
    ./usr/share/doc/libsmartcols1/copyright\
"
FILES_libuuid1 = " \
    ./lib/arm-linux-gnueabihf/libuuid.so.1 \
    ./lib/arm-linux-gnueabihf/libuuid.so.1.3.0 \
    ./usr/share/doc/libuuid1/changelog.Debian.gz \
    ./usr/share/doc/libuuid1/changelog.gz \
    ./usr/share/doc/libuuid1/copyright\
"
FILES_mount = " \
    ./bin/mount \
    ./bin/umount \
    ./sbin/losetup \
    ./sbin/swapoff \
    ./sbin/swapon \
    ./usr/share/bash-completion/completions/losetup \
    ./usr/share/bash-completion/completions/mount \
    ./usr/share/bash-completion/completions/swapoff \
    ./usr/share/bash-completion/completions/swapon \
    ./usr/share/bash-completion/completions/umount \
    ./usr/share/doc/mount/NEWS.Debian.gz \
    ./usr/share/doc/mount/changelog.Debian.gz \
    ./usr/share/doc/mount/changelog.gz \
    ./usr/share/doc/mount/copyright \
    ./usr/share/doc/mount/examples/fstab \
    ./usr/share/doc/mount/examples/mount.fstab \
    ./usr/share/doc/mount/mount.txt \
    ./usr/share/lintian/overrides/mount \
    ./usr/share/man/man5/fstab.5.gz \
    ./usr/share/man/man8/losetup.8.gz \
    ./usr/share/man/man8/mount.8.gz \
    ./usr/share/man/man8/swapoff.8.gz \
    ./usr/share/man/man8/swapon.8.gz \
    ./usr/share/man/man8/umount.8.gz\
"
FILES_${PN} = " \
    ./bin/dmesg \
    ./bin/findmnt \
    ./bin/lsblk \
    ./bin/more \
    ./bin/mountpoint \
    ./bin/su \
    ./bin/wdctl \
    ./etc/default/hwclock \
    ./etc/init.d/hwclock.sh \
    ./etc/pam.d/runuser \
    ./etc/pam.d/runuser-l \
    ./etc/pam.d/su \
    ./etc/pam.d/su-l \
    ./lib/systemd/system/fstrim.service \
    ./lib/systemd/system/fstrim.timer \
    ./lib/udev/hwclock-set \
    ./lib/udev/rules.d/85-hwclock.rules \
    ./sbin/agetty \
    ./sbin/blkdiscard \
    ./sbin/blkid \
    ./sbin/blkzone \
    ./sbin/blockdev \
    ./sbin/chcpu \
    ./sbin/ctrlaltdel \
    ./sbin/findfs \
    ./sbin/fsck \
    ./sbin/fsck.cramfs \
    ./sbin/fsck.minix \
    ./sbin/fsfreeze \
    ./sbin/fstrim \
    ./sbin/getty \
    ./sbin/hwclock \
    ./sbin/isosize \
    ./sbin/mkfs \
    ./sbin/mkfs.bfs \
    ./sbin/mkfs.cramfs \
    ./sbin/mkfs.minix \
    ./sbin/mkswap \
    ./sbin/pivot_root \
    ./sbin/raw \
    ./sbin/runuser \
    ./sbin/sulogin \
    ./sbin/swaplabel \
    ./sbin/switch_root \
    ./sbin/wipefs \
    ./sbin/zramctl \
    ./usr/bin/addpart \
    ./usr/bin/choom \
    ./usr/bin/chrt \
    ./usr/bin/delpart \
    ./usr/bin/fallocate \
    ./usr/bin/fincore \
    ./usr/bin/flock \
    ./usr/bin/getopt \
    ./usr/bin/ionice \
    ./usr/bin/ipcmk \
    ./usr/bin/ipcrm \
    ./usr/bin/ipcs \
    ./usr/bin/last \
    ./usr/bin/lastb \
    ./usr/bin/linux32 \
    ./usr/bin/linux64 \
    ./usr/bin/lscpu \
    ./usr/bin/lsipc \
    ./usr/bin/lslocks \
    ./usr/bin/lslogins \
    ./usr/bin/lsmem \
    ./usr/bin/lsns \
    ./usr/bin/mcookie \
    ./usr/bin/mesg \
    ./usr/bin/namei \
    ./usr/bin/nsenter \
    ./usr/bin/partx \
    ./usr/bin/prlimit \
    ./usr/bin/rename.ul \
    ./usr/bin/resizepart \
    ./usr/bin/rev \
    ./usr/bin/setarch \
    ./usr/bin/setpriv \
    ./usr/bin/setsid \
    ./usr/bin/setterm \
    ./usr/bin/taskset \
    ./usr/bin/unshare \
    ./usr/bin/utmpdump \
    ./usr/bin/whereis \
    ./usr/lib/mime/packages/util-linux \
    ./usr/sbin/chmem \
    ./usr/sbin/fdformat \
    ./usr/sbin/ldattach \
    ./usr/sbin/readprofile \
    ./usr/sbin/rtcwake \
    ./usr/share/bash-completion/completions/addpart \
    ./usr/share/bash-completion/completions/blkdiscard \
    ./usr/share/bash-completion/completions/blkid \
    ./usr/share/bash-completion/completions/blkzone \
    ./usr/share/bash-completion/completions/blockdev \
    ./usr/share/bash-completion/completions/chcpu \
    ./usr/share/bash-completion/completions/chmem \
    ./usr/share/bash-completion/completions/chrt \
    ./usr/share/bash-completion/completions/ctrlaltdel \
    ./usr/share/bash-completion/completions/delpart \
    ./usr/share/bash-completion/completions/dmesg \
    ./usr/share/bash-completion/completions/fallocate \
    ./usr/share/bash-completion/completions/fdformat \
    ./usr/share/bash-completion/completions/fincore \
    ./usr/share/bash-completion/completions/findfs \
    ./usr/share/bash-completion/completions/findmnt \
    ./usr/share/bash-completion/completions/flock \
    ./usr/share/bash-completion/completions/fsck \
    ./usr/share/bash-completion/completions/fsck.cramfs \
    ./usr/share/bash-completion/completions/fsck.minix \
    ./usr/share/bash-completion/completions/fsfreeze \
    ./usr/share/bash-completion/completions/fstrim \
    ./usr/share/bash-completion/completions/getopt \
    ./usr/share/bash-completion/completions/hwclock \
    ./usr/share/bash-completion/completions/ionice \
    ./usr/share/bash-completion/completions/ipcmk \
    ./usr/share/bash-completion/completions/ipcrm \
    ./usr/share/bash-completion/completions/ipcs \
    ./usr/share/bash-completion/completions/isosize \
    ./usr/share/bash-completion/completions/last \
    ./usr/share/bash-completion/completions/ldattach \
    ./usr/share/bash-completion/completions/lsblk \
    ./usr/share/bash-completion/completions/lscpu \
    ./usr/share/bash-completion/completions/lsipc \
    ./usr/share/bash-completion/completions/lslocks \
    ./usr/share/bash-completion/completions/lslogins \
    ./usr/share/bash-completion/completions/lsmem \
    ./usr/share/bash-completion/completions/lsns \
    ./usr/share/bash-completion/completions/mcookie \
    ./usr/share/bash-completion/completions/mesg \
    ./usr/share/bash-completion/completions/mkfs \
    ./usr/share/bash-completion/completions/mkfs.bfs \
    ./usr/share/bash-completion/completions/mkfs.cramfs \
    ./usr/share/bash-completion/completions/mkfs.minix \
    ./usr/share/bash-completion/completions/mkswap \
    ./usr/share/bash-completion/completions/more \
    ./usr/share/bash-completion/completions/mountpoint \
    ./usr/share/bash-completion/completions/namei \
    ./usr/share/bash-completion/completions/nsenter \
    ./usr/share/bash-completion/completions/partx \
    ./usr/share/bash-completion/completions/pivot_root \
    ./usr/share/bash-completion/completions/prlimit \
    ./usr/share/bash-completion/completions/raw \
    ./usr/share/bash-completion/completions/readprofile \
    ./usr/share/bash-completion/completions/resizepart \
    ./usr/share/bash-completion/completions/rev \
    ./usr/share/bash-completion/completions/rtcwake \
    ./usr/share/bash-completion/completions/setarch \
    ./usr/share/bash-completion/completions/setpriv \
    ./usr/share/bash-completion/completions/setsid \
    ./usr/share/bash-completion/completions/setterm \
    ./usr/share/bash-completion/completions/su \
    ./usr/share/bash-completion/completions/swaplabel \
    ./usr/share/bash-completion/completions/taskset \
    ./usr/share/bash-completion/completions/unshare \
    ./usr/share/bash-completion/completions/utmpdump \
    ./usr/share/bash-completion/completions/wdctl \
    ./usr/share/bash-completion/completions/whereis \
    ./usr/share/bash-completion/completions/wipefs \
    ./usr/share/bash-completion/completions/zramctl \
    ./usr/share/doc/util-linux/00-about-docs.txt \
    ./usr/share/doc/util-linux/AUTHORS.gz \
    ./usr/share/doc/util-linux/NEWS.Debian.gz \
    ./usr/share/doc/util-linux/PAM-configuration.txt \
    ./usr/share/doc/util-linux/README.Debian \
    ./usr/share/doc/util-linux/blkid.txt \
    ./usr/share/doc/util-linux/cal.txt \
    ./usr/share/doc/util-linux/changelog.Debian.gz \
    ./usr/share/doc/util-linux/changelog.gz \
    ./usr/share/doc/util-linux/col.txt \
    ./usr/share/doc/util-linux/copyright \
    ./usr/share/doc/util-linux/deprecated.txt \
    ./usr/share/doc/util-linux/examples/filesystems \
    ./usr/share/doc/util-linux/examples/fstab \
    ./usr/share/doc/util-linux/examples/fstab.example2 \
    ./usr/share/doc/util-linux/examples/getopt-parse.bash \
    ./usr/share/doc/util-linux/examples/getopt-parse.tcsh \
    ./usr/share/doc/util-linux/examples/motd \
    ./usr/share/doc/util-linux/examples/securetty \
    ./usr/share/doc/util-linux/examples/shells \
    ./usr/share/doc/util-linux/examples/udev-raw.rules \
    ./usr/share/doc/util-linux/getopt.txt \
    ./usr/share/doc/util-linux/getopt_changelog.txt \
    ./usr/share/doc/util-linux/howto-build-sys.txt \
    ./usr/share/doc/util-linux/howto-compilation.txt \
    ./usr/share/doc/util-linux/howto-contribute.txt.gz \
    ./usr/share/doc/util-linux/howto-debug.txt \
    ./usr/share/doc/util-linux/howto-man-page.txt.gz \
    ./usr/share/doc/util-linux/howto-pull-request.txt.gz \
    ./usr/share/doc/util-linux/howto-tests.txt \
    ./usr/share/doc/util-linux/howto-usage-function.txt.gz \
    ./usr/share/doc/util-linux/hwclock.txt \
    ./usr/share/doc/util-linux/modems-with-agetty.txt \
    ./usr/share/doc/util-linux/mount.txt \
    ./usr/share/doc/util-linux/parse-date.txt.gz \
    ./usr/share/doc/util-linux/pg.txt \
    ./usr/share/doc/util-linux/poeigl.txt.gz \
    ./usr/share/doc/util-linux/release-schedule.txt \
    ./usr/share/doc/util-linux/releases/v2.13-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.14-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.15-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.16-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.17-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.18-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.19-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.20-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.21-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.22-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.23-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.24-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.25-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.26-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.27-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.28-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.29-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.30-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.31-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.32-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.33-ReleaseNotes.gz \
    ./usr/share/doc/util-linux/releases/v2.33.1-ReleaseNotes \
    ./usr/share/lintian/overrides/util-linux \
    ./usr/share/man/man1/choom.1.gz \
    ./usr/share/man/man1/chrt.1.gz \
    ./usr/share/man/man1/dmesg.1.gz \
    ./usr/share/man/man1/fallocate.1.gz \
    ./usr/share/man/man1/fincore.1.gz \
    ./usr/share/man/man1/flock.1.gz \
    ./usr/share/man/man1/getopt.1.gz \
    ./usr/share/man/man1/ionice.1.gz \
    ./usr/share/man/man1/ipcmk.1.gz \
    ./usr/share/man/man1/ipcrm.1.gz \
    ./usr/share/man/man1/ipcs.1.gz \
    ./usr/share/man/man1/last.1.gz \
    ./usr/share/man/man1/lastb.1.gz \
    ./usr/share/man/man1/linux32.1.gz \
    ./usr/share/man/man1/linux64.1.gz \
    ./usr/share/man/man1/lscpu.1.gz \
    ./usr/share/man/man1/lsipc.1.gz \
    ./usr/share/man/man1/lslogins.1.gz \
    ./usr/share/man/man1/lsmem.1.gz \
    ./usr/share/man/man1/mcookie.1.gz \
    ./usr/share/man/man1/mesg.1.gz \
    ./usr/share/man/man1/more.1.gz \
    ./usr/share/man/man1/mountpoint.1.gz \
    ./usr/share/man/man1/namei.1.gz \
    ./usr/share/man/man1/nsenter.1.gz \
    ./usr/share/man/man1/prlimit.1.gz \
    ./usr/share/man/man1/rename.ul.1.gz \
    ./usr/share/man/man1/rev.1.gz \
    ./usr/share/man/man1/runuser.1.gz \
    ./usr/share/man/man1/setpriv.1.gz \
    ./usr/share/man/man1/setsid.1.gz \
    ./usr/share/man/man1/setterm.1.gz \
    ./usr/share/man/man1/su.1.gz \
    ./usr/share/man/man1/taskset.1.gz \
    ./usr/share/man/man1/unshare.1.gz \
    ./usr/share/man/man1/utmpdump.1.gz \
    ./usr/share/man/man1/whereis.1.gz \
    ./usr/share/man/man5/adjtime_config.5.gz \
    ./usr/share/man/man5/hwclock.5.gz \
    ./usr/share/man/man5/terminal-colors.d.5.gz \
    ./usr/share/man/man8/addpart.8.gz \
    ./usr/share/man/man8/agetty.8.gz \
    ./usr/share/man/man8/blkdiscard.8.gz \
    ./usr/share/man/man8/blkid.8.gz \
    ./usr/share/man/man8/blkzone.8.gz \
    ./usr/share/man/man8/blockdev.8.gz \
    ./usr/share/man/man8/chcpu.8.gz \
    ./usr/share/man/man8/chmem.8.gz \
    ./usr/share/man/man8/ctrlaltdel.8.gz \
    ./usr/share/man/man8/delpart.8.gz \
    ./usr/share/man/man8/fdformat.8.gz \
    ./usr/share/man/man8/findfs.8.gz \
    ./usr/share/man/man8/findmnt.8.gz \
    ./usr/share/man/man8/fsck.8.gz \
    ./usr/share/man/man8/fsck.cramfs.8.gz \
    ./usr/share/man/man8/fsck.minix.8.gz \
    ./usr/share/man/man8/fsfreeze.8.gz \
    ./usr/share/man/man8/fstrim.8.gz \
    ./usr/share/man/man8/getty.8.gz \
    ./usr/share/man/man8/hwclock.8.gz \
    ./usr/share/man/man8/isosize.8.gz \
    ./usr/share/man/man8/ldattach.8.gz \
    ./usr/share/man/man8/lsblk.8.gz \
    ./usr/share/man/man8/lslocks.8.gz \
    ./usr/share/man/man8/lsns.8.gz \
    ./usr/share/man/man8/mkfs.8.gz \
    ./usr/share/man/man8/mkfs.bfs.8.gz \
    ./usr/share/man/man8/mkfs.cramfs.8.gz \
    ./usr/share/man/man8/mkfs.minix.8.gz \
    ./usr/share/man/man8/mkswap.8.gz \
    ./usr/share/man/man8/partx.8.gz \
    ./usr/share/man/man8/pivot_root.8.gz \
    ./usr/share/man/man8/raw.8.gz \
    ./usr/share/man/man8/readprofile.8.gz \
    ./usr/share/man/man8/resizepart.8.gz \
    ./usr/share/man/man8/rtcwake.8.gz \
    ./usr/share/man/man8/setarch.8.gz \
    ./usr/share/man/man8/sulogin.8.gz \
    ./usr/share/man/man8/swaplabel.8.gz \
    ./usr/share/man/man8/switch_root.8.gz \
    ./usr/share/man/man8/wdctl.8.gz \
    ./usr/share/man/man8/wipefs.8.gz \
    ./usr/share/man/man8/zramctl.8.gz\
"
FILES_uuid-dev = " \
    ./usr/include/uuid/uuid.h \
    ./usr/lib/arm-linux-gnueabihf/libuuid.a \
    ./usr/lib/arm-linux-gnueabihf/libuuid.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/uuid.pc \
    ./usr/share/doc/uuid-dev/changelog.Debian.gz \
    ./usr/share/doc/uuid-dev/changelog.gz \
    ./usr/share/doc/uuid-dev/copyright \
    ./usr/share/man/man3/uuid.3.gz \
    ./usr/share/man/man3/uuid_clear.3.gz \
    ./usr/share/man/man3/uuid_compare.3.gz \
    ./usr/share/man/man3/uuid_copy.3.gz \
    ./usr/share/man/man3/uuid_generate.3.gz \
    ./usr/share/man/man3/uuid_generate_random.3.gz \
    ./usr/share/man/man3/uuid_generate_time.3.gz \
    ./usr/share/man/man3/uuid_generate_time_safe.3.gz \
    ./usr/share/man/man3/uuid_is_null.3.gz \
    ./usr/share/man/man3/uuid_parse.3.gz \
    ./usr/share/man/man3/uuid_time.3.gz \
    ./usr/share/man/man3/uuid_unparse.3.gz\
"
