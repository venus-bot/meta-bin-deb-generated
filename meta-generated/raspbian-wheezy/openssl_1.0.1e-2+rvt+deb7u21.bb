PACKAGES = "libssl1.0.0"
PROVIDES = "libssl1.0.0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/o/openssl/libssl1.0.0_1.0.1e-2+rvt+deb7u21_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libssl1.0.0 = "libssl1.0.0_1.0.1e-2+rvt+deb7u21_armhf.deb"
SRC_URI[deb0.sha256sum] = "4e2252f1e3a9cbf7cee848865097290bf7fe565f15cd87f20f4ebfc8936f53f7"
SRC_URI[deb0.md5sum] = "458627ae6f5afb995581db4ec1e9aa15"

RDEPENDS_libssl1.0.0 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) zlib1g (>= 1:1.1.4) debconf (>= 0.5)"
DEPENDS = "libgcc1 debconf zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libssl1.0.0 = " \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libchil.so \
	./usr/share/doc/libssl1.0.0/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libpadlock.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/lib4758cca.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libcapi.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libaep.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libcswift.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libnuron.so \
	./usr/share/doc/libssl1.0.0/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libssl.so.1.0.0 \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libgost.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libsureware.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libatalla.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libgmp.so \
	./usr/lib/arm-linux-gnueabihf/libcrypto.so.1.0.0 \
	./usr/share/doc/libssl1.0.0/copyright \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libubsec.so\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
