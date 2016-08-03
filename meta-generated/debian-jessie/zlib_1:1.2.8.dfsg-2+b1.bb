PACKAGES = "zlib1g zlib1g-dev"
PROVIDES = "zlib1g zlib1g-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/z/zlib/zlib1g_1.2.8.dfsg-2+b1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/z/zlib/zlib1g-dev_1.2.8.dfsg-2+b1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.8.dfsg-2+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "00e6d9f3671993ce9d69eec27816181f974a7859e547a1edc65ebba2d0273703"
SRC_URI[deb0.md5sum] = "7f654390409cba672c5139a67be47af0"
DEBFILENAME_zlib1g-dev = "zlib1g-dev_1.2.8.dfsg-2+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "47ac608bdf09d83981c8d115d7daabcd7b1215ab26a7706964640b0f818ceb5d"
SRC_URI[deb1.md5sum] = "1c848a40d78d11d6824ea2d777ff9335"

RDEPENDS_${PN}1g = "libc6 (>= 2.4)"
RDEPENDS_${PN}1g-dev = "zlib1g (= 1:1.2.8.dfsg-2+b1) libc6-dev"
DEPENDS = "libc6-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_zlib1g = " \
	./usr/share/doc/zlib1g/changelog.Debian.armhf.gz \
	./usr/share/doc/zlib1g/copyright \
	./usr/share/doc/zlib1g/changelog.gz \
	./usr/share/doc/zlib1g/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libz.so.1 \
	./lib/arm-linux-gnueabihf/libz.so.1.2.8\
"
FILES_zlib1g-dev = " \
	./usr/share/doc/zlib1g-dev/algorithm.txt.gz \
	./usr/share/doc/zlib1g-dev/examples/zpipe.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gun.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gzappend.c.gz \
	./usr/include/zlib.h \
	./usr/share/doc/zlib1g-dev/README.gz \
	./usr/share/doc/zlib1g-dev/changelog.Debian.armhf.gz \
	./usr/share/man/man3/zlib.3.gz \
	./usr/share/doc/zlib1g-dev/examples/example.c.gz \
	./usr/share/doc/zlib1g-dev/examples/infcover.c.gz \
	./usr/share/doc/zlib1g-dev/examples/zlib_how.html \
	./usr/lib/arm-linux-gnueabihf/libz.a \
	./usr/share/doc/zlib1g-dev/copyright \
	./usr/include/arm-linux-gnueabihf/zconf.h \
	./usr/share/doc/zlib1g-dev/FAQ.gz \
	./usr/share/doc/zlib1g-dev/examples/zran.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gzlog.h.gz \
	./usr/share/doc/zlib1g-dev/examples/minigzip.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gzlog.c.gz \
	./usr/lib/arm-linux-gnueabihf/libz.so \
	./usr/share/doc/zlib1g-dev/examples/fitblk.c.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/zlib.pc \
	./usr/share/doc/zlib1g-dev/examples/enough.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gzjoin.c.gz \
	./usr/share/doc/zlib1g-dev/examples/README.examples \
	./usr/share/doc/zlib1g-dev/changelog.Debian.gz \
	./usr/share/doc/zlib1g-dev/txtvsbin.txt.gz \
	./usr/share/doc/zlib1g-dev/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
