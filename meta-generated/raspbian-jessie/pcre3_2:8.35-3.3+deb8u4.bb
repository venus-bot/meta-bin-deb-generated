PACKAGES = "libpcre3"
PROVIDES = "libpcre3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3_8.35-3.3+deb8u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpcre3 = "libpcre3_8.35-3.3+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "dc4c25aa393477265414fce7cf657e11d325cdbb579db26c4ed789fce543777a"
SRC_URI[deb0.md5sum] = "1346df9c4c2c6e0156ba04298a27a585"

RDEPENDS_lib${PN} = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpcre3 = " \
	./usr/share/doc/libpcre3/copyright \
	./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3.13.1 \
	./usr/share/doc/libpcre3/AUTHORS \
	./usr/share/doc/libpcre3/changelog.Debian.gz \
	./usr/share/man/man3/pcrepattern.3.gz \
	./lib/arm-linux-gnueabihf/libpcre.so.3 \
	./usr/share/doc/libpcre3/NEWS.gz \
	./lib/arm-linux-gnueabihf/libpcre.so.3.13.1 \
	./usr/share/doc/libpcre3/README.gz \
	./usr/share/doc/libpcre3/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3 \
	./usr/share/doc/libpcre3/README.Debian\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
