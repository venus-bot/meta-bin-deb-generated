PACKAGES = "${PN} zlib1g zlib1g-dev"
PROVIDES = "zlib1g zlib1g-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g_1.2.8.dfsg-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g-dev_1.2.8.dfsg-2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.8.dfsg-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "6ccc881c8a3d9841239466145113570618a03cb63e1f547b76dacac5e4fa2bd9"
SRC_URI[deb0.md5sum] = "03beeedc8aa430fbd746959126ef7d9a"
DEBFILENAME_zlib1g-dev = "zlib1g-dev_1.2.8.dfsg-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "b97e3d0668daa13a7c648f6f85d4777550ec2bbb48d6044b4416408b6b8027aa"
SRC_URI[deb1.md5sum] = "f466fa71d786a428243a4b7c1305a7b8"

RDEPENDS_${PN}1g = "libc6 (>= 2.4)"
RDEPENDS_${PN}1g-dev = "zlib1g (= 1:1.2.8.dfsg-2) libc6-dev"
DEPENDS = "libc6 libc6-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_zlib1g = " \
    ./lib/arm-linux-gnueabihf/libz.so.1 \
    ./lib/arm-linux-gnueabihf/libz.so.1.2.8 \
    ./usr/share/doc/zlib1g/changelog.Debian.gz \
    ./usr/share/doc/zlib1g/changelog.gz \
    ./usr/share/doc/zlib1g/copyright\
"
FILES_zlib1g-dev = " \
    ./usr/include/arm-linux-gnueabihf/zconf.h \
    ./usr/include/zlib.h \
    ./usr/lib/arm-linux-gnueabihf/libz.a \
    ./usr/lib/arm-linux-gnueabihf/libz.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/zlib.pc \
    ./usr/share/doc/zlib1g-dev/FAQ.gz \
    ./usr/share/doc/zlib1g-dev/README.gz \
    ./usr/share/doc/zlib1g-dev/algorithm.txt.gz \
    ./usr/share/doc/zlib1g-dev/changelog.Debian.gz \
    ./usr/share/doc/zlib1g-dev/changelog.gz \
    ./usr/share/doc/zlib1g-dev/copyright \
    ./usr/share/doc/zlib1g-dev/examples/README.examples \
    ./usr/share/doc/zlib1g-dev/examples/enough.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/example.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/fitblk.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gun.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gzappend.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gzjoin.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gzlog.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gzlog.h.gz \
    ./usr/share/doc/zlib1g-dev/examples/infcover.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/minigzip.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/zlib_how.html \
    ./usr/share/doc/zlib1g-dev/examples/zpipe.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/zran.c.gz \
    ./usr/share/doc/zlib1g-dev/txtvsbin.txt.gz \
    ./usr/share/man/man3/zlib.3.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
