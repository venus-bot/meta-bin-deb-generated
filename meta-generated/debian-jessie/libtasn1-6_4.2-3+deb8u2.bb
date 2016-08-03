PACKAGES = "libtasn1-6"
PROVIDES = "libtasn1-6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libt/libtasn1-6/libtasn1-6_4.2-3+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtasn1-6 = "libtasn1-6_4.2-3+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "d8d54541c1851c3eeb7d7456e678c4a2e1286f3cfee15be77bc1b9e6c4d89a62"
SRC_URI[deb0.md5sum] = "39da696ec122b46582c70966c005eeb0"

RDEPENDS_${PN} = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libtasn1-6/THANKS \
	./usr/share/doc/libtasn1-6/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/libtasn1.so.6.3.2 \
	./usr/share/doc/libtasn1-6/README \
	./usr/lib/arm-linux-gnueabihf/libtasn1.so.6 \
	./usr/share/doc/libtasn1-6/changelog.Debian.gz \
	./usr/share/doc/libtasn1-6/AUTHORS \
	./usr/share/doc/libtasn1-6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
