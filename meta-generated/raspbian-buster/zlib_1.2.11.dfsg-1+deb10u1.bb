PACKAGES = "${PN} zlib1g zlib1g-dev"
PROVIDES = "zlib1g zlib1g-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g_1.2.11.dfsg-1+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g-dev_1.2.11.dfsg-1+deb10u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.11.dfsg-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "160672754c0e2ae1c6ac6257bee331d8fe49e9906e7577de14e7a52a47727135"
SRC_URI[deb0.md5sum] = "daaea0b028addf41f63d7f517663ae0e"
DEBFILENAME_zlib1g-dev = "zlib1g-dev_1.2.11.dfsg-1+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "c4dc9385a462cdb525e9202d109464947cfb2871553e5da804376f0de9ac521f"
SRC_URI[deb1.md5sum] = "89caf422265aca6f0f4256881c413756"

RDEPENDS_${PN}1g = "libc6 (>= 2.4)"
RDEPENDS_${PN}1g-dev = "libc6-dev zlib1g (= 1:1.2.11.dfsg-1+deb10u1)"
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
