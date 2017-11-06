PACKAGES = "libtiff4"
PROVIDES = "libtiff4"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tiff3/libtiff4_3.9.6-11+deb7u8_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtiff4 = "libtiff4_3.9.6-11+deb7u8_armhf.deb"
SRC_URI[deb0.sha256sum] = "b394cb82fee51de03e5657a055e8bc8d86febdcb732e1bedf88e6937c8a812fd"
SRC_URI[deb0.md5sum] = "71863227013f4db43fdaf3144addb327"

RDEPENDS_libtiff4 = "libc6 (>= 2.13-28) libjbig0 libjpeg8 (>= 8c) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libjbig0 libjpeg8 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libtiff4 = " \
	./usr/share/doc/libtiff4/README.Debian \
	./usr/share/doc/libtiff4/TODO \
	./usr/share/doc/libtiff4/changelog.gz \
	./usr/share/lintian/overrides/libtiff4 \
	./usr/share/doc/libtiff4/copyright \
	./usr/lib/arm-linux-gnueabihf/libtiff.so.4 \
	./usr/share/doc/libtiff4/changelog.Debian.gz \
	./usr/share/doc/libtiff4/README \
	./usr/lib/arm-linux-gnueabihf/libtiff.so.4.3.6\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"