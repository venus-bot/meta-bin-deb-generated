PACKAGES = "${PN} libsystemd0"
PROVIDES = "libsystemd0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libsystemd0_215-17+deb8u7_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd0 = "libsystemd0_215-17+deb8u7_armhf.deb"
SRC_URI[deb0.sha256sum] = "64fe4d7f4f7e2a431d6124b2094e303e6d9b73a9e0ee2f803a101b798fdf15d2"
SRC_URI[deb0.md5sum] = "4809c8a8514e48da94d95fa6b5322b09"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsystemd0 = " \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0 \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0.3.1 \
    ./usr/share/doc/libsystemd0/changelog.Debian.gz \
    ./usr/share/doc/libsystemd0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
