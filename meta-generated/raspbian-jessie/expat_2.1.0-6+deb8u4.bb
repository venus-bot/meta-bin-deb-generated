PACKAGES = "libexpat1 libexpat1-dev"
PROVIDES = "libexpat1 libexpat1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/expat/libexpat1_2.1.0-6+deb8u4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/e/expat/libexpat1-dev_2.1.0-6+deb8u4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libexpat1 = "libexpat1_2.1.0-6+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "7be018fae424421c5a7762714c4888eeadf53d26a4f0841fe3cf7b171d8a97c4"
SRC_URI[deb0.md5sum] = "45a1c2a9c06f9d56adcddc653f945243"
DEBFILENAME_libexpat1-dev = "libexpat1-dev_2.1.0-6+deb8u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "ecf28e4e2b486cc048480682b142d283bcc0e335385e24a5b8144f7e6459ea76"
SRC_URI[deb1.md5sum] = "9144aec215a83c215811406d7a963bd0"

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
	./lib/arm-linux-gnueabihf/libexpat.so.1.6.0 \
	./usr/share/doc/libexpat1/changelog.gz \
	./usr/share/doc/libexpat1/copyright \
	./usr/share/doc/libexpat1/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libexpat.so.1 \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.0\
"
FILES_libexpat1-dev = " \
	./usr/include/expat.h \
	./usr/share/doc/libexpat1-dev/copyright \
	./usr/share/doc/libexpat1-dev/expat.html/expat.png \
	./usr/include/arm-linux-gnueabihf/expat_config.h \
	./usr/share/doc/libexpat1-dev/changelog.Debian.gz \
	./usr/share/doc/libexpat1-dev/expat.html/reference.html \
	./usr/include/expat_external.h \
	./usr/share/doc/libexpat1-dev/changelog.gz \
	./usr/share/doc/libexpat1-dev/expat.html/style.css \
	./usr/share/doc/libexpat1-dev/expat.html/xmlwf.1.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/expat.pc \
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
