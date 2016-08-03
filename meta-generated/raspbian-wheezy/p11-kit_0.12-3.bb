PACKAGES = "libp11-kit0"
PROVIDES = "libp11-kit0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/p11-kit/libp11-kit0_0.12-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libp11-kit0 = "libp11-kit0_0.12-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "bb17e21d76e16d949ae2340fccba95acd0e0215b7e6837c9d3043afd50cce09d"
SRC_URI[deb0.md5sum] = "90df88b70b36aa8d5f16624e52ab67c4"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libp11-kit0 = " \
	./usr/share/doc/libp11-kit0/copyright \
	./usr/share/doc/libp11-kit0/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0.0.0 \
	./usr/share/doc/libp11-kit0/examples/pkcs11.conf.example \
	./usr/share/doc/libp11-kit0/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
