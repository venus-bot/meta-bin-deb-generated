PACKAGES = "${PN} debconf"
PROVIDES = "debconf"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/debconf/debconf_1.5.56+deb8u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_debconf = "debconf_1.5.56+deb8u1_all.deb"
SRC_URI[deb0.sha256sum] = "c0496d049b8fdb2b2eea0b9f644d127b0fc6499e0b950d8ee5bba830ccfa0faa"
SRC_URI[deb0.md5sum] = "c6c212c4bd19a817c122c1e65c3cf96f"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/perl5/Debconf/Element/Teletype/Progress.pm \
    ./usr/share/perl5/Debconf/Gettext.pm \
    ./usr/share/perl5/Debconf/Element/Web/Select.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Text.pm \
    ./usr/share/perl5/Debconf/Element/Web/Note.pm \
    ./usr/share/perl5/Debconf/Element/Kde.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/String.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Note.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Error.pm \
    ./usr/share/perl5/Debconf/Config.pm \
    ./usr/share/perl5/Debconf/Element/Editor/String.pm \
    ./usr/share/perl5/Debconf/Format/822.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Password.pm \
    ./usr/share/perl5/Debconf/Element/Kde/Password.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Password.pm \
    ./usr/share/perl5/Debconf/AutoSelect.pm \
    ./usr/share/perl5/Debconf/DbDriver.pm \
    ./etc/apt/apt.conf.d/70debconf \
    ./usr/share/perl5/Debconf/Element/Editor/Select.pm \
    ./etc/debconf.conf \
    ./usr/share/perl5/Debconf/DbDriver/Stack.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Text.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Boolean.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Kde/Wizard.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/String.pm \
    ./usr/share/perl5/Debconf/FrontEnd.pm \
    ./usr/lib/python2.7/dist-packages/debconf.py \
    ./usr/share/perl5/Debconf/FrontEnd/Passthrough.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/String.pm \
    ./usr/share/perl5/Debconf/Element/Multiselect.pm \
    ./usr/share/man/man1/debconf-apt-progress.1.gz \
    ./usr/share/debconf/frontend \
    ./usr/share/perl5/Debian/DebConf/Client/ConfModule.pm \
    ./usr/share/perl5/Debconf/Format.pm \
    ./usr/share/perl5/Debconf/Element/Web/Text.pm \
    ./usr/share/pixmaps/debian-logo.png \
    ./usr/share/perl5/Debconf/DbDriver/Cache.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Multiselect.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Readline.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Select.pm \
    ./usr/bin/debconf-copydb \
    ./usr/share/perl5/Debconf/Element/Dialog/Boolean.pm \
    ./usr/share/perl5/Debconf/DbDriver/Pipe.pm \
    ./usr/sbin/dpkg-reconfigure \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Multiselect.pm \
    ./usr/share/perl5/Debconf/Path.pm \
    ./usr/share/perl5/Debconf/Element.pm \
    ./usr/bin/debconf-apt-progress \
    ./usr/share/debconf/fix_db.pl \
    ./usr/share/perl5/Debconf/Priority.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Multiselect.pm \
    ./usr/share/man/man1/debconf-escape.1.gz \
    ./usr/share/doc/debconf/copyright \
    ./usr/share/doc/debconf/changelog.gz \
    ./usr/share/perl5/Debconf/Client/ConfModule.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Password.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Text.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Boolean.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Kde/Ui_DebconfWizard.pm \
    ./usr/share/perl5/Debconf/Element/Kde/Note.pm \
    ./usr/share/debconf/transition_db.pl \
    ./usr/share/perl5/Debconf/DbDriver/PackageDir.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive.pm \
    ./usr/share/perl5/Debconf/Element/Kde/Text.pm \
    ./usr/share/debconf/confmodule \
    ./usr/share/perl5/Debconf/ConfModule.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Error.pm \
    ./usr/share/man/man8/dpkg-preconfigure.8.gz \
    ./usr/bin/debconf-communicate \
    ./usr/share/perl5/Debconf/Element/Dialog/Multiselect.pm \
    ./usr/share/debconf/confmodule.sh \
    ./usr/share/perl5/Debconf/Element/Dialog/Error.pm \
    ./usr/share/perl5/Debconf/Encoding.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/String.pm \
    ./usr/share/perl5/Debconf/Iterator.pm \
    ./usr/share/perl5/Debconf/Question.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Multiselect.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Gnome.pm \
    ./usr/share/perl5/Debconf/DbDriver/File.pm \
    ./usr/share/perl5/Debconf/Log.pm \
    ./usr/share/perl5/Debconf/Db.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Noninteractive.pm \
    ./usr/share/perl5/Debconf/Element/Kde/Select.pm \
    ./usr/share/perl5/Debconf/Template.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Note.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Error.pm \
    ./usr/share/perl5/Debconf/Base.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Password.pm \
    ./usr/share/doc/debconf/README.Debian \
    ./usr/share/perl5/Debconf/DbDriver/LDAP.pm \
    ./etc/bash_completion.d/debconf \
    ./usr/share/perl5/Debconf/Element/Teletype/Note.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Note.pm \
    ./usr/lib/python3/dist-packages/debconf.py \
    ./usr/share/perl5/Debconf/DbDriver/DirTree.pm \
    ./usr/share/perl5/Debconf/Element/Web/Password.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Editor.pm \
    ./usr/share/perl5/Debconf/Element/Web/Multiselect.pm \
    ./usr/bin/debconf-show \
    ./usr/share/lintian/overrides/debconf \
    ./usr/share/perl5/Debconf/Element/Kde/Error.pm \
    ./usr/share/man/man1/debconf-show.1.gz \
    ./usr/share/perl5/Debconf/Element/Dialog/Text.pm \
    ./usr/share/perl5/Debconf/Element/Web/String.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Select.pm \
    ./usr/share/perl5/Debconf/FrontEnd/ScreenSize.pm \
    ./usr/share/perl5/Debconf/DbDriver/Debug.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Teletype.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Progress.pm \
    ./usr/share/man/man1/debconf-communicate.1.gz \
    ./usr/share/debconf/debconf.conf \
    ./usr/bin/debconf-escape \
    ./usr/share/perl5/Debconf/Element/Kde/String.pm \
    ./usr/share/perl5/Debconf/Template/Transient.pm \
    ./usr/share/perl5/Debconf/Element/Web/Error.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Progress.pm \
    ./usr/share/man/man8/dpkg-reconfigure.8.gz \
    ./usr/share/perl5/Debconf/FrontEnd/Web.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Password.pm \
    ./usr/share/perl5/Debconf/Element/Kde/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Select.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Error.pm \
    ./usr/share/perl5/Debconf/TmpFile.pm \
    ./usr/share/man/man1/debconf-set-selections.1.gz \
    ./usr/share/perl5/Debconf/FrontEnd/Dialog.pm \
    ./usr/bin/debconf \
    ./usr/share/man/man1/debconf-copydb.1.gz \
    ./usr/share/perl5/Debconf/Element/Web/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Kde/Multiselect.pm \
    ./usr/share/perl5/Debconf/Element/Gnome.pm \
    ./usr/share/perl5/Debconf/DbDriver/Directory.pm \
    ./usr/share/perl5/Debconf/DbDriver/Backup.pm \
    ./usr/share/perl5/Debconf/Element/Web/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Progress.pm \
    ./usr/bin/debconf-set-selections \
    ./usr/share/perl5/Debconf/Element/Teletype/Select.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Text.pm \
    ./usr/sbin/dpkg-preconfigure \
    ./usr/share/perl5/Debconf/Element/Dialog/Select.pm \
    ./usr/share/perl5/Debconf/Element/Kde/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Text.pm \
    ./usr/share/perl5/Debconf/DbDriver/Copy.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Note.pm \
    ./usr/share/man/man1/debconf.1.gz \
    ./usr/share/perl5/Debconf/FrontEnd/Kde.pm\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
