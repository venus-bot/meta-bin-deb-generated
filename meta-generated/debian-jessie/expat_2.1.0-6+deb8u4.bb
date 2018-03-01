PACKAGES = "libexpat1 libexpat1-dev"
PROVIDES = "libexpat1 libexpat1-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/e/expat/libexpat1_2.1.0-6+deb8u4_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/e/expat/libexpat1-dev_2.1.0-6+deb8u4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libexpat1 = "libexpat1_2.1.0-6+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "5444982b2a0e2d091e1918de2fdded3ddaad79e766fc3c984c3ad61341696b89"
SRC_URI[deb0.md5sum] = "908e3ad199f6668e143d0bcd60dff879"
DEBFILENAME_libexpat1-dev = "libexpat1-dev_2.1.0-6+deb8u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "63820acac7b6e004c403412b64dcb611d552bb9d0abe73a058a59fa0d4394803"
SRC_URI[deb1.md5sum] = "49409b1de4041bb3a6135322929a578f"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0)"
RDEPENDS_lib${PN}1-dev = "libexpat1 (= 2.1.0-6+deb8u4) libc6-dev"
DEPENDS = "libgcc1 libc6-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libexpat1 = " \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1 \
	./usr/share/doc/libexpat1/copyright \
	./usr/share/doc/libexpat1/changelog.gz \
	./lib/arm-linux-gnueabihf/libexpat.so.1.6.0 \
	./usr/share/doc/libexpat1/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libexpat.so.1 \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.0\
"
FILES_libexpat1-dev = " \
	./usr/share/doc/libexpat1-dev/copyright \
	./usr/share/doc/libexpat1-dev/expat.html/expat.png \
	./usr/include/expat.h \
	./usr/share/doc/libexpat1-dev/changelog.Debian.gz \
	./usr/include/expat_external.h \
	./usr/share/doc/libexpat1-dev/changelog.gz \
	./usr/share/doc/libexpat1-dev/expat.html/xmlwf.1.gz \
	./usr/share/doc/libexpat1-dev/expat.html/style.css \
	./usr/share/doc/libexpat1-dev/expat.html/reference.html \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/expat.pc \
	./usr/include/arm-linux-gnueabihf/expat_config.h \
	./usr/lib/arm-linux-gnueabihf/libexpatw.la \
	./usr/lib/arm-linux-gnueabihf/libexpat.a \
	./usr/share/doc-base/expat \
	./usr/lib/arm-linux-gnueabihf/libexpat.la \
	./usr/share/doc/libexpat1-dev/expat.html/index.html \
	./usr/lib/arm-linux-gnueabihf/libexpat.so \
	./usr/share/doc/libexpat1-dev/examples/outline.c \
	./usr/share/doc/libexpat1-dev/expat.html/valid-xhtml10.png \
	./usr/share/aclocal/expat.m4 \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so \
	./usr/share/doc/libexpat1-dev/README.gz \
	./usr/lib/arm-linux-gnueabihf/libexpatw.a \
	./usr/share/doc/libexpat1-dev/expat.html/xmlwf.sgml.gz \
	./usr/share/doc/libexpat1-dev/examples/elements.c\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
