PACKAGES = "${PN} gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
PROVIDES = "gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/gcc-4.9-base_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libatomic1_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libgcc1_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libgomp1_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libstdc++6_4.9.2-10+deb8u1_armhf.deb;unpack=0;name=deb4\
"
DEBFILENAME_gcc-4.9-base = "gcc-4.9-base_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "e3347abf22223ec2a591ed341cdf713250a2bce439936ed105cf6edc9e74c99a"
SRC_URI[deb0.md5sum] = "a4e2a88643ae337cf300b5989c6d2ad6"
DEBFILENAME_libatomic1 = "libatomic1_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "539e08cf0f89cd377eaa959941974a861393fd7c5fe79acc03601a827a517671"
SRC_URI[deb1.md5sum] = "7557e5e9d0f0cc065a0a6ca03371eb5a"
DEBFILENAME_libgcc1 = "libgcc1_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "d3ab354cb569aac0ebc59ca04dcf8f18995883112dd012707cf32e8b560e3262"
SRC_URI[deb2.md5sum] = "963077b9b10823209358063476193ee7"
DEBFILENAME_libgomp1 = "libgomp1_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb3.sha256sum] = "c648cb0e90215fbc90bf52f82afa1779ec0788baf152df5f42c5bbc2ea46938f"
SRC_URI[deb3.md5sum] = "5dd53055692c8460cbeb9991a80f5528"
DEBFILENAME_libstdc++6 = "libstdc++6_4.9.2-10+deb8u1_armhf.deb"
SRC_URI[deb4.sha256sum] = "ac649740a0735181153e0557622907324e85ae9d0f248788248025d947c5e65a"
SRC_URI[deb4.md5sum] = "7bcaf58beb4566b276f56db7913aeb16"

RDEPENDS_libatomic1 = "gcc-4.9-base (= 4.9.2-10+deb8u1) libc6 (>= 2.4)"
RDEPENDS_libgcc1 = "gcc-4.9-base (= 4.9.2-10+deb8u1) libc6 (>= 2.4)"
RDEPENDS_libgomp1 = "gcc-4.9-base (= 4.9.2-10+deb8u1) libc6 (>= 2.17)"
RDEPENDS_libstdc++6 = "gcc-4.9-base (= 4.9.2-10+deb8u1) libc6 (>= 2.18) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gcc-4.9-base = " \
    ./usr/lib/gcc/arm-linux-gnueabihf/4.9.2 \
    ./usr/share/doc/gcc-4.9-base/README.Debian.armhf.gz \
    ./usr/share/doc/gcc-4.9-base/TODO.Debian \
    ./usr/share/doc/gcc-4.9-base/changelog.Debian.gz \
    ./usr/share/doc/gcc-4.9-base/copyright\
"
FILES_libatomic1 = " \
    ./usr/lib/arm-linux-gnueabihf/libatomic.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libatomic.so.1.1.0 \
    ./usr/share/doc/libatomic1\
"
FILES_libgcc1 = " \
    ./lib/arm-linux-gnueabihf/libgcc_s.so.1 \
    ./usr/share/doc/libgcc1 \
    ./usr/share/lintian/overrides/libgcc1\
"
FILES_libgomp1 = " \
    ./usr/lib/arm-linux-gnueabihf/libgomp.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libgomp.so.1.0.0 \
    ./usr/share/doc/libgomp1\
"
FILES_libstdc++6 = " \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20 \
    ./usr/share/doc/libstdc++6 \
    ./usr/share/gcc-4.9/python/libstdcxx/__init__.py \
    ./usr/share/gcc-4.9/python/libstdcxx/v6/__init__.py \
    ./usr/share/gcc-4.9/python/libstdcxx/v6/printers.py \
    ./usr/share/gdb/auto-load/usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20-gdb.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
