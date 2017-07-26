PACKAGES = "libtasn1-3"
PROVIDES = "libtasn1-3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libt/libtasn1-3/libtasn1-3_2.13-2+deb7u5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtasn1-3 = "libtasn1-3_2.13-2+deb7u5_armhf.deb"
SRC_URI[deb0.sha256sum] = "ee007c240995d307534937a6b88f936e9813d5b5611987e767ac28256a553e68"
SRC_URI[deb0.md5sum] = "7a4777683eccce53cc135814c8cc4746"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libtasn1-3/copyright \
	./usr/share/doc/libtasn1-3/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/libtasn1.so.3 \
	./usr/share/doc/libtasn1-3/THANKS \
	./usr/share/doc/libtasn1-3/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libtasn1.so.3.1.16 \
	./usr/share/doc/libtasn1-3/README \
	./usr/share/doc/libtasn1-3/changelog.gz \
	./usr/share/doc/libtasn1-3/AUTHORS\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
