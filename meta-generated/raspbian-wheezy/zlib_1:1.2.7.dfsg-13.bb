PACKAGES = "zlib1g zlib1g-dev"
PROVIDES = "zlib1g zlib1g-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g_1.2.7.dfsg-13_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g-dev_1.2.7.dfsg-13_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.7.dfsg-13_armhf.deb"
SRC_URI[deb0.sha256sum] = "0789b0eeb527054e6f834dc717689a470bd4d25f55548cdd890924dbc9379a46"
SRC_URI[deb0.md5sum] = "efcbf46d520b22c56f57fe0693ed9f69"
DEBFILENAME_zlib1g-dev = "zlib1g-dev_1.2.7.dfsg-13_armhf.deb"
SRC_URI[deb1.sha256sum] = "20bf2bc166512610e76b07aa32c9010e61f5fbc04316e19b2d2e72c755104c94"
SRC_URI[deb1.md5sum] = "b774b9725833b7b19a7f7412ebfbb53b"

RDEPENDS_${PN}1g = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
RDEPENDS_${PN}1g-dev = "zlib1g (= 1:1.2.7.dfsg-13) libc6-dev"
DEPENDS = "libgcc1 libc6-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_zlib1g = " \
	./usr/share/doc/zlib1g/copyright \
	./lib/arm-linux-gnueabihf/libz.so.1.2.7 \
	./usr/share/doc/zlib1g/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libz.so.1 \
	./usr/share/doc/zlib1g/changelog.gz\
"
FILES_zlib1g-dev = " \
	./usr/share/doc/zlib1g-dev/algorithm.txt.gz \
	./usr/share/doc/zlib1g-dev/examples/zpipe.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gun.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gzappend.c.gz \
	./usr/include/zlib.h \
	./usr/share/doc/zlib1g-dev/README.gz \
	./usr/share/doc/zlib1g-dev/changelog.gz \
	./usr/share/man/man3/zlib.3.gz \
	./usr/share/doc/zlib1g-dev/examples/example.c.gz \
	./usr/share/doc/zlib1g-dev/examples/infcover.c.gz \
	./usr/share/doc/zlib1g-dev/examples/zlib_how.html \
	./usr/lib/arm-linux-gnueabihf/libz.a \
	./usr/share/doc/zlib1g-dev/copyright \
	./usr/share/doc/zlib1g-dev/FAQ.gz \
	./usr/share/doc/zlib1g-dev/examples/zran.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gzlog.h.gz \
	./usr/include/zconf.h \
	./usr/share/doc/zlib1g-dev/examples/minigzip.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gzlog.c.gz \
	./usr/lib/arm-linux-gnueabihf/libz.so \
	./usr/share/doc/zlib1g-dev/examples/fitblk.c.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/zlib.pc \
	./usr/share/doc/zlib1g-dev/examples/enough.c.gz \
	./usr/share/doc/zlib1g-dev/examples/gzjoin.c.gz \
	./usr/share/doc/zlib1g-dev/examples/README.examples \
	./usr/share/doc/zlib1g-dev/changelog.Debian.gz \
	./usr/share/doc/zlib1g-dev/txtvsbin.txt.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
