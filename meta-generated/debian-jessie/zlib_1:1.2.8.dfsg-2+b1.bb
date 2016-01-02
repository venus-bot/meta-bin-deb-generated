PACKAGES = "zlib1g"
PROVIDES = "zlib1g"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/z/zlib/zlib1g_1.2.8.dfsg-2+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.8.dfsg-2+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "00e6d9f3671993ce9d69eec27816181f974a7859e547a1edc65ebba2d0273703"
SRC_URI[deb0.md5sum] = "7f654390409cba672c5139a67be47af0"

RDEPENDS_${PN}1g = "libc6 (>= 2.4)"
DEPENDS = "libc6"


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
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
