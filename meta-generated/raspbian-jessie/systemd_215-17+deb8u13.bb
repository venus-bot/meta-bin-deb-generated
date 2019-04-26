PACKAGES = "${PN} libsystemd0"
PROVIDES = "libsystemd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_215-17+deb8u13_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd0 = "libsystemd0_215-17+deb8u13_armhf.deb"
SRC_URI[deb0.sha256sum] = "21a9c4be6e97d0d59dcd42f68837cf222fe0a69dac1c25a51bcc58c3f275e906"
SRC_URI[deb0.md5sum] = "0fcb297ff07d402642b0082a36cf13d5"


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
