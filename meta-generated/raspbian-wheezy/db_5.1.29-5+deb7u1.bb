PACKAGES = "libdb5.1"
PROVIDES = "libdb5.1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/db/libdb5.1_5.1.29-5+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdb5.1 = "libdb5.1_5.1.29-5+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "e26fab9994ec2462fff1da346491d9e3d13914b7ded95f29ac356b49a5584dd4"
SRC_URI[deb0.md5sum] = "17837e711e04720299cabc64397c3173"

RDEPENDS_lib${PN}5.1 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libdb5.1 = " \
	./usr/share/doc/libdb5.1/build_signature_armhf.txt \
	./usr/lib/arm-linux-gnueabihf/libdb-5.1.so \
	./usr/share/lintian/overrides/libdb5.1 \
	./usr/share/doc/libdb5.1/copyright \
	./usr/share/doc/libdb5.1/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
