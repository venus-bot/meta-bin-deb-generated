PACKAGES = "${PN} x11-common"
PROVIDES = "x11-common"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/x/xorg/x11-common_7.7+7_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11-common = "x11-common_7.7+7_all.deb"
SRC_URI[deb0.sha256sum] = "5ea7301f38ffdfd987655e55b7ce74aa556718f20fca79077e0cf69372022c95"
SRC_URI[deb0.md5sum] = "34aab40c713182b3d30d717c83bb6455"

RDEPENDS_x11-common = "debconf (>= 0.5) lsb-base (>= 1.3-9ubuntu2)"
DEPENDS = "debconf lsb-base"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_x11-common = " \
    ./etc/X11/Xreset \
    ./etc/X11/Xreset.d/README \
    ./etc/X11/Xresources/x11-common \
    ./etc/X11/Xsession \
    ./etc/X11/Xsession.d/20x11-common_process-args \
    ./etc/X11/Xsession.d/30x11-common_xresources \
    ./etc/X11/Xsession.d/35x11-common_xhost-local \
    ./etc/X11/Xsession.d/40x11-common_xsessionrc \
    ./etc/X11/Xsession.d/50x11-common_determine-startup \
    ./etc/X11/Xsession.d/90x11-common_ssh-agent \
    ./etc/X11/Xsession.d/99x11-common_start \
    ./etc/X11/Xsession.options \
    ./etc/X11/rgb.txt \
    ./etc/init.d/x11-common \
    ./usr/bin/X11 \
    ./usr/share/X11/rgb.txt \
    ./usr/share/doc/x11-common/NEWS.Debian.gz \
    ./usr/share/doc/x11-common/TODO \
    ./usr/share/doc/x11-common/changelog.Debian.old.gz \
    ./usr/share/doc/x11-common/changelog.gz \
    ./usr/share/doc/x11-common/copyright \
    ./usr/share/lintian/overrides/x11-common \
    ./usr/share/man/man5/Xsession.5.gz \
    ./usr/share/man/man5/Xsession.options.5.gz \
    ./usr/share/man/man5/Xwrapper.config.5.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
