PACKAGES = "${PN} zlib1g zlib1g-dev"
PROVIDES = "zlib1g zlib1g-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g_1.2.11.dfsg-1+deb10u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g-dev_1.2.11.dfsg-1+deb10u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.11.dfsg-1+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "7672fb96a04f39288a9068050a001062948240c9f89080d1875715b3a01f66a8"
SRC_URI[deb0.md5sum] = "63f915b60cd32562d9d9621cbeea8c49"
DEBFILENAME_zlib1g-dev = "zlib1g-dev_1.2.11.dfsg-1+deb10u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "c9ed43e51f0fd56e2c80461b135a40d6516ae552e92e5aa53bd2adb3fa020035"
SRC_URI[deb1.md5sum] = "828a94d0ad77f5fcc10e3a2ec1655deb"

RDEPENDS_${PN}1g = "libc6 (>= 2.4)"
RDEPENDS_${PN}1g-dev = "libc6-dev zlib1g (= 1:1.2.11.dfsg-1+deb10u2)"
DEPENDS = "libc6 libc6-dev"


inherit deb_group

FILES_zlib1g = " \
    ./lib/arm-linux-gnueabihf/libz.so.1 \
    ./lib/arm-linux-gnueabihf/libz.so.1.2.11 \
    ./usr/share/doc/zlib1g/changelog.Debian.gz \
    ./usr/share/doc/zlib1g/changelog.gz \
    ./usr/share/doc/zlib1g/copyright\
"
FILES_zlib1g-dev = " \
    ./usr/include/zconf.h \
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
